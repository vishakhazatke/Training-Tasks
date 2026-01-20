package com.example.orderapp;

import com.example.orderapp.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")  // H2 in-memory
class ApplicationIntegrationTest {

    @Autowired
    private OrderService orderService;

    @Test
    void contextLoads() {
        assertEquals(300, orderService.calculateTotal(100, 3));
    }
}
