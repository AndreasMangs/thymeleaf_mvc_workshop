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

        String diagnose = "";


        if (temp >= 38){
            diagnose = "You have a fever";
        } else if (temp <= 36) {
            diagnose = "You have hypothermia";
        } else {
            diagnose = "You are healthy";
        }

        model.addAttribute("diagnose", diagnose.toString());

        return "fever";
    }

    @PostMapping("/fever")
    public String formInput(@RequestParam("temp") double temp){
        this.temp = temp;
        return "redirect:/fever";
    }


}
