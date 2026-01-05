package com.example.springboot_core.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevService implements  MessageService{

    @Override
    public String getMessage() {
        return "DEV profile";
    }
}
