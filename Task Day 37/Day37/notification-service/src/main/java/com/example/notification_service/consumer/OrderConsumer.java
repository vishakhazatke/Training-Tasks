package com.example.notification_service.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {

    @KafkaListener(topics = "order-topic", groupId = "notification-group")
    public void consumeOrder(String order) {
        System.out.println("Notification Received: Order = " + order);
    }
}
