package controller;

import model.Notepad;
import model.Notepads;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.NotepadService;

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

    @RequestMapping(value = "/notepad/create", method = RequestMethod.POST)
    public Notepads createNotepad(@RequestBody Notepad notepad){
        Notepad notepad1 = notepad;
        Notepads newNotepad = new Notepads(notepad1);
        notepadService.create(newNotepad);
        return newNotepad;
    }

}
