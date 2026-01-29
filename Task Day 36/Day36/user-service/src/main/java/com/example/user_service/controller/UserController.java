package com.example.user_service.controller;

import com.example.user_service.feign.OrderClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final OrderClient orderClient;

    public UserController(OrderClient orderClient) {
        this.orderClient = orderClient;
    }

    @GetMapping("/users/orders")
    public String getOrdersFromOrderService() {
        return orderClient.getOrders();
    }
}
