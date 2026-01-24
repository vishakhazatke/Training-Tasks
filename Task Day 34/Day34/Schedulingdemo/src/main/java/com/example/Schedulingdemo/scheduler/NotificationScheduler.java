package com.example.Schedulingdemo.scheduler;

import com.example.Schedulingdemo.async.NotificationService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class NotificationScheduler {

    private final NotificationService notificationService;

    public NotificationScheduler(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Scheduled(cron = "0 */10 * * * ?")
    public void triggerNotification(){
        System.out.println("Triggering async notification");
        notificationService.sendNotification();
    }
}
