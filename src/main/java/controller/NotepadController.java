package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.NotepadService;

import javax.xml.ws.Response;

@RestController
public class NotepadController {

    /*@Autowired
    NotepadService notepadService;*/

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "Welcome to Spring boot API!!!";
    }

}
