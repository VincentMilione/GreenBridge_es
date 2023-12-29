package com.greenbridge.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class UserController {

    @GetMapping("/registrazione-cliente")
    public String registrazione(Model model) {
        return "pages/user/home";
    }

    @GetMapping("/modifica-utente")
    public String modificaUtente() {
        return "pages/user/modify";
    }
    
}
