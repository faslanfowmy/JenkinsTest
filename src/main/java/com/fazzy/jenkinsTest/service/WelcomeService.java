package com.fazzy.jenkinsTest.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public String Greet() {
        return "Hello Developers,This is DEV_QA_Pipeline Test!!!";
    }

}
