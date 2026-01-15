package com.example.securitydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/public")
    public String publicApi(){
        return "Hello this is Public API";
    }

    @GetMapping("/user")
    public String userApi(){
        return "Hello User";
    }

    @GetMapping("/admin")
    public String adminApi(){
        return "Hello Admin";
    }
}
