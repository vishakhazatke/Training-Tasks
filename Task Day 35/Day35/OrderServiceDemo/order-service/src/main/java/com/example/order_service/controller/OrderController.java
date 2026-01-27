package com.example.order_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/orders/{id}")
    public String getOrderDetails(@PathVariable int id) {

        String userResponse =
                restTemplate.getForObject(
                        "http://localhost:8081/users/" + id,
                        String.class
                );

        return "Order ID: " + id + " | " + userResponse;
    }
}
