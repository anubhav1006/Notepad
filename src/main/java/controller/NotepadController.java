package controller;

import org.springframework.beans.factory.annotation.Autowired;
import service.NotepadService;


public class NotepadController {

    @Autowired
    NotepadService notepadService;

}
