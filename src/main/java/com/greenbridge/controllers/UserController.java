package com.greenbridge.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.greenbridge.entities.User;

@Controller
public class UserController {

    @GetMapping("/")
    public String getNotes(Model model) {
        model.addAttribute("user", new User());

        return "pages/user/home";
    }

    @PostMapping("/new-user")
    public String createuser(@ModelAttribute("user") User user, Model model){
        
        System.out.println("email:" + user.getEmail());
        System.out.println("password:" + user.getPassword());

        return "pages/user/success";
    }

}
