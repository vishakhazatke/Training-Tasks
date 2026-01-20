package com.example.orderapp.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public double calculateTotal(double price, int quantity) {
        if (price <= 0 || quantity <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        return price * quantity;
    }
}
