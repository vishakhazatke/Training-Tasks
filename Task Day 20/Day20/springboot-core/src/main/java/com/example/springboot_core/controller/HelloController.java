package com.example.springboot_core.controller;

import com.example.springboot_core.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final MessageService messageService;

    public HelloController(MessageService messageService){
        this.messageService = messageService;
    }

    @GetMapping("/hello")
    public String hello(){
        return messageService.getMessage();
    }
}
