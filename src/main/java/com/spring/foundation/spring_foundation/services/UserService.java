package com.spring.foundation.spring_foundation.services;

import com.spring.foundation.spring_foundation.models.User;
import com.spring.foundation.spring_foundation.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }
}
