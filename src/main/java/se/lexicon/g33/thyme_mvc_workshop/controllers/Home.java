package se.lexicon.g33.thyme_mvc_workshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @GetMapping("/index")
    String index() {
        return "index";
    }
    @GetMapping("/contact")
    String contact(){
        return "contact";
    }

}
