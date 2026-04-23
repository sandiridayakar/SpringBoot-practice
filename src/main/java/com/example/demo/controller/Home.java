package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Home {

    @RequestMapping("/")
    public String show(){
        return "welcome";
    }

}
