package com.example.consumer_service.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @RabbitListener(queues = "order.queue")
    public void receive(String message){
        System.out.println("Received message: " + message);
    }
}
