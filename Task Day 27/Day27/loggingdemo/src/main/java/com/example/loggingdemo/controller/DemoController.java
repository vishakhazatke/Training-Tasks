package com.example.loggingdemo.controller;

import com.example.loggingdemo.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
public class DemoController {

    private static final Logger logger =
            LoggerFactory.getLogger(DemoController.class);

    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String name){

        logger.info("Controller method started");

        String result = demoService.process(name);

        logger.info("Controller method finished");
        return result;
    }
}
