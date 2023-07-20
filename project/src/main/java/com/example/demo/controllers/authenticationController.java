package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class authenticationController{

    @GetMapping("/login")
    public String login(){
            return  "успешен логин";
    }

    @GetMapping("/register")
    public ResponseEntity<String> register (){
        return null;
    }
}
