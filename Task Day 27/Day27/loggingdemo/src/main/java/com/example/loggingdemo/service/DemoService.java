package com.example.loggingdemo.service;

import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class DemoService {

    private static final Logger logger =
            LoggerFactory.getLogger(DemoService.class);

    public String process(String name){

        logger.info("Service method started");

        if(name == null || name.isEmpty()){
            logger.warn("Name is null or Empty");
            return "Invalid name";
        }

        logger.debug("Processing name: {}", name);

        logger.info("Service method completed");
        return "Hello " + name;
    }
}
