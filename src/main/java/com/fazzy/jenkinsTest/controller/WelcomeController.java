package com.fazzy.jenkinsTest.controller;

import com.fazzy.jenkinsTest.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Autowired
    WelcomeService service;

    @GetMapping("/")
    public String greet() {
        return service.Greet();
    }
}
