package controller;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 786fe4472cc0e8e0139e72c77ad4ef7b164e9f4f
import service.NotepadService;

@RestController
public class NotepadController {

    @Autowired
    NotepadService notepadService;

}
