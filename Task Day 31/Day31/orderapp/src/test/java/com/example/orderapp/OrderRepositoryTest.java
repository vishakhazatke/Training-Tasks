package com.example.orderapp;

import com.example.orderapp.entity.OrderEntity;
import com.example.orderapp.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
class OrderRepositoryTest {

    @Autowired
    private OrderRepository repository;

    @Test
    void shouldSaveAndFetchOrder() {
        OrderEntity order = new OrderEntity();
        order.setPrice(100);
        order.setQuantity(2);

        OrderEntity saved = repository.save(order);
        assertNotNull(saved.getId());
    }
}
