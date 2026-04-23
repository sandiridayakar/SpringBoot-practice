package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class about {

    @RequestMapping("/about")
    public String showString(){
        return "This is a Spring Boot application.";
    }

}
