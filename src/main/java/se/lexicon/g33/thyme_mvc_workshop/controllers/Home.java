package se.lexicon.g33.thyme_mvc_workshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Home {

    private List<String> inputs = new ArrayList<>();

    @GetMapping("/index")
    public String index() {
        return "index";
    }
    @GetMapping("/contact")
    public String contact(Model model){
        model.addAttribute("inputs", inputs);
        return "contact";
    }

    @PostMapping("/contact")
    public String contact(@RequestParam("input") String input){
        inputs.add(input);
        return "redirect:/contact";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

}
