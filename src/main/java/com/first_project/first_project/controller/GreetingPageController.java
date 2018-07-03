package com.first_project.first_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingPageController {

    @GetMapping(value = {"/", "/home"})
    private String homePageLoad(Model model) {
        //return a value to view, and you can refer to with 'helloworld'
        model.addAttribute("helloworld", "Hello Epam! :)");
        return "index";
    }

    @RequestMapping(value = "/greeting",method = RequestMethod.GET)
    private String greetingPageLoad(Model model, @RequestParam( value="name", required = false, defaultValue = "EPAM") String nameValue) {
        model.addAttribute("nameValue", nameValue);
        return "greeting";
    }

}
