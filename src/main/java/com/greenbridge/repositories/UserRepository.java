package com.greenbridge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenbridge.entities.User;

public interface UserRepository extends JpaRepository<User, String>{
    
}
