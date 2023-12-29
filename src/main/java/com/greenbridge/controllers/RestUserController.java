package com.greenbridge.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.greenbridge.entities.User;
import com.greenbridge.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class RestUserController {
    @Autowired
    private UserService service;

    @PostMapping("/api/modifica-utente")
    public ResponseEntity<String> modifyUser(@RequestBody User user) {
        //TODO: process POST request
        service.modifyUser(user);
        return ResponseEntity.ok("Tutto ok!");
    }

    @PostMapping("/api/registrazione")
    public ResponseEntity<String> completaRegistrazione(@RequestBody User user) {
        //TODO: process POST request
        service.saveUser(user);
        return ResponseEntity.ok("Tutto ok!");
    }
    
    
}
