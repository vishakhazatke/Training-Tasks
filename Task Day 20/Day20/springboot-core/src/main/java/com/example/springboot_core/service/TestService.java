package com.example.springboot_core.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
public class TestService implements MessageService{
    @Override
    public String getMessage() {
        return "TEST profile";
    }
}
