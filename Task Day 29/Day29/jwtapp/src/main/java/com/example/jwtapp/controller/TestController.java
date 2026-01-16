package com.example.jwtapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/user")
    public String user() {
        return "USER ACCESS GRANTED";
    }

    @GetMapping("/admin/data")
    public String admin() {
        return "ADMIN ACCESS GRANTED";
    }
}
