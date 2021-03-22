package se.lexicon.g33.thyme_mvc_workshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Fever {

    private double temp = 37;

    @GetMapping("/fever")
    public String formInput(Model model) {

        StringBuilder diagnose = new StringBuilder();

        if (temp >= 38){
            diagnose.append("You have a fever");
        } else if (temp <= 36) {
            diagnose.append("You have hypothermia");
        } else {
            diagnose.append("You are healthy");
        }

        model.addAttribute("diagnose", diagnose);

        return "fever";
    }

    @PostMapping("/fever")
    public String formInput(@RequestParam("temp") double temp){
        this.temp = temp;
        return "redirect:/fever";
    }


}
