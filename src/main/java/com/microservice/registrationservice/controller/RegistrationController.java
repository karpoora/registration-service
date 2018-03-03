package com.microservice.registrationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @GetMapping(path="/test-register")
    public String testController(){
        return "Successfully Tested";
    }
}
