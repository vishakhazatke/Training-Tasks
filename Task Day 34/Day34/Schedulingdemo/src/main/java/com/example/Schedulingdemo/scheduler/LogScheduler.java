package com.example.Schedulingdemo.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class LogScheduler {

    @Scheduled(cron = "0 */10 * * * ?")
    public void logData() {
        System.out.println("Logging data at: " + LocalDateTime.now());
    }
}
