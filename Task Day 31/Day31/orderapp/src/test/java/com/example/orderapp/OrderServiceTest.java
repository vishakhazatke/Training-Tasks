package com.example.orderapp;

import com.example.orderapp.service.OrderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    private OrderService orderService;

    @BeforeEach
    void setup() {
        orderService = new OrderService();
    }

    @Test
    void shouldCalculateTotal() {
        double result = orderService.calculateTotal(100, 2);
        assertEquals(200, result);
    }

    @Test
    void shouldThrowExceptionForInvalidInput() {
        assertThrows(IllegalArgumentException.class,
                () -> orderService.calculateTotal(-10, 1));
    }
}
