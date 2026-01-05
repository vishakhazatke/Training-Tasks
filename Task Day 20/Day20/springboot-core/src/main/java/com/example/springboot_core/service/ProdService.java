package com.example.springboot_core.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdService implements MessageService{
    @Override
    public String getMessage() {
        return "PROD profile";
    }
}
