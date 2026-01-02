package com.example.demo;

import com.example.demo.config.AppConfig;
import com.example.demo.controller.UserController;
import com.example.demo.model.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = context.getBean(Car.class);
        car.drive();

        UserController controller = context.getBean(UserController.class);
        controller.processRequest();

        String app1 = context.getBean("appName", String.class);
        String app2 = context.getBean("appName", String.class);

        System.out.println(app1);
        System.out.println("Singleton Check: " + (app1 == app2));

        context.close();
    }
}
