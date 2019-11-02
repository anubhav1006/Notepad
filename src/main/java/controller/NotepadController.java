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
    public List<Notepad> allActiveNotepads(){
        return notepadService.getAllNotepads();
    }

    @RequestMapping(value = "/notepadids", method = RequestMethod.GET)
    public List<Notepads> allActiveNotepadIds(){
        return notepadService.allActiveNotepadIds();
    }

    /*@RequestMapping(value = "/notepadlist", method = RequestMethod.GET)
    public List<Notepad> allActiveNotepadDetails(){

        List<Notepad> list = new ArrayList<>();
        for(Notepads notepads: notepadService.getAllNotepads()){
            list.add(notepads.getNotepad());
        }

        return list;
    }*/

    @RequestMapping(value = "/notepad/create", method = RequestMethod.POST)
    public Notepad createNotepad(@RequestBody Notepad notepad){
        Notepad notepad1 = notepad;
        Notepads newNotepad = new Notepads(notepad1);
        newNotepad.setNotepad(notepad1);
        notepadService.create(notepad1);
        return notepad1;
    }

    @RequestMapping(value = "/notepad/update/{id}", method = RequestMethod.PUT)
    public Notepad updateNotepad(@PathVariable(value = "id") Long id, @RequestBody Notepad notepad){

        Notepad notepad1 = notepadService.getNotepadRequestById(id);
        notepad1.setText(notepad.getText());
        notepad1.setTitle(notepad.getTitle());
        notepad1.setUser(notepad.getUser());
        notepadService.update(notepad1);
        return notepad1;
    }
    @RequestMapping(value = "/notepad/delete/{id}", method = RequestMethod.DELETE)
    public Notepad deleteNotepad(@PathVariable(value = "id") Long id){
        Notepad notepad1 = notepadService.getNotepadRequestById(id);
        notepadService.deleteChild(id);
        return notepad1;
    }

    @RequestMapping(value = "/notepad/deleteAll", method = RequestMethod.GET)
    public String deleteAll(){
        List<Notepad> notepads= notepadService.getAllNotepads();
        for(Notepad it:notepads){
            notepadService.deleteChild(it.getId());
        }
        return "Deleted All";
    }

}
