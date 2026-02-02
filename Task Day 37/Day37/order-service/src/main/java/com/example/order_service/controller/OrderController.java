package com.example.order_service.controller;

import com.example.order_service.service.OrderProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderProducerService producerService;

    public OrderController(OrderProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping
    public String placeOrder(@RequestBody String order) {
        producerService.sendOrder(order);
        return "Order placed successfully!";
    }
}
