package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    @Autowired
    public  UserService(UserRepository userRepository) {this.userRepository = userRepository;}

    public User register(User userData){
       return userRepository.save(userData);
    }

    //get all user
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //get user by id
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

}
