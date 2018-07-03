package com.first_project.controller;

import com.first_project.entity.User;
import com.first_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class DummyUserRegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user-registration")
    public String loadUserRegSite(Model model){
        model.addAttribute("user", new User());
        model.addAttribute("userList", userService.getAllUser());
        return "user-registration";
    }

    @RequestMapping(value = "/add-user", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String addUserToSession(@Valid User user, BindingResult bindingResult){
        if(!bindingResult.hasErrors()){
            userService.addNewUserToList(user);
        }
        return "redirect:/user-registration";
    }
}mes
