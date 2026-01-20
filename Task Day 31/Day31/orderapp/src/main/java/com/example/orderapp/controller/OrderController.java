package com.example.orderapp.controller;

import com.example.orderapp.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/total")
    public double total(@RequestParam double price,
                        @RequestParam int quantity) {
        return service.calculateTotal(price, quantity);
    }
}
