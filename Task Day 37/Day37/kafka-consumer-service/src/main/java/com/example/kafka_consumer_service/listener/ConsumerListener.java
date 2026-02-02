package com.example.kafka_consumer_service.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerListener {

    @KafkaListener(topics = "test-topic", groupId = "test-group")
    public void consumeMessage(String message){
        System.out.println("Received message: " + message);
    }
}
