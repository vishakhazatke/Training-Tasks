package com.example.Schedulingdemo.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Async
    public void sendNotification() {
        try {
            System.out.println("Notification started on thread: " + Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println("Notification sent!");
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
