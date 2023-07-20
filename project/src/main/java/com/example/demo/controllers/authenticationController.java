package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.google.gson.*;

@RestController
@AllArgsConstructor
@CrossOrigin
public class authenticationController{

    private UserService userService;
    private Gson gson = new Gson();

    @GetMapping("/login")
    public String login(){
            return  "успешен логин";
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User userData) {
        User user = userService.register(userData);
        return ResponseEntity.ok(gson.toJson(user));
    }
}
