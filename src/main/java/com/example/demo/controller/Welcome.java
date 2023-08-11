package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/Hi")
    public String getMessage(){return "welcome to cicd pipeline java project";}
}
