package controller;

import model.Notepad;
import model.Notepads;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.NotepadService;

import java.util.ArrayList;
import java.util.List;


@RestController
public class NotepadController {

    @Autowired
    NotepadService notepadService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "Welcome to Spring boot API!!!";
    }

    @RequestMapping(value = "/notepads", method = RequestMethod.GET)
    public List<Notepads> allActiveNotepads(){
        return notepadService.getAllNotepads();
    }

    @RequestMapping(value = "/notepadids", method = RequestMethod.GET)
    public List<Notepads> allActiveNotepadIds(){
        return notepadService.allActiveNotepadIds();
    }

    @RequestMapping(value = "/notepadlist", method = RequestMethod.GET)
    public List<Notepad> allActiveNotepadDetails(){

        List<Notepad> list = new ArrayList<>();
        for(Notepads notepads: notepadService.getAllNotepads()){
            list.add(notepads.getNotepad());
        }

        return list;
    }

    @RequestMapping(value = "/notepad/create", method = RequestMethod.POST)
    public Notepads createNotepad(@RequestBody Notepad notepad){
        Notepad notepad1 = notepad;
        Notepads newNotepad = new Notepads(notepad1);
        newNotepad.setNotepad(notepad1);
        notepadService.create(newNotepad);
        return newNotepad;
    }

    @RequestMapping(value = "/notepad/update/{id}", method = RequestMethod.PUT)
    public Notepads updateNotepad(@PathVariable(value = "id") Long id, @RequestBody Notepad notepad){

        Notepads notepads = notepadService.getApiRequestById(id);
        Notepad oldNotepad = notepads.getNotepad();
        System.out.println(oldNotepad.getId());
        notepadService.deleteChild(oldNotepad.getId());
        notepads.setNotepad(notepad);
        notepadService.update(notepads);
        return notepads;
    }
    @RequestMapping(value = "/notepad/delete/{id}", method = RequestMethod.DELETE)
    public String deleteNotepad(@PathVariable(value = "id") Long id){
        notepadService.delete(id);
        return "Deleted";
    }

}
