package com.greenbridge.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenbridge.entities.User;
import com.greenbridge.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public void saveUser(User user) {
        if (repository.existsById(user.getEmail()))
            throw new RuntimeException("utente esiste già");
        repository.save(user);
    }

    public void modifyUser(User user) {
        //utente loggato è effetivamente lo stesso di quello che richiede la modifica
        if (!repository.existsById(user.getEmail()))  
            throw new RuntimeException("utente non esiste");
        repository.save(user);
    }
}
