package com.nitesh.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/welcome")
    public String welcomeRequest() {
        return "Welcome to Spring Boot Application - DemoAPP";
    }
}
