package com.greenbridge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.greenbridge.entities.User;
import com.greenbridge.services.UserService;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/registrazione-cliente")
    public String registrazione(Model model) {
        model.addAttribute("utente", new User());
        return "pages/user/home";
    }
    
    @PostMapping("/registrazione")
    public String completaRegistrazione(@ModelAttribute User user) {
        //TODO: process POST request
        service.saveUser(user);
        return "pages/user/success";
    }
    
}
