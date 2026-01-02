package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private Engine engine;

    @Value("MH12 AB 9999")
    private String carNumber;

    @Autowired
    public Car(@Qualifier("dieselEngine") Engine engine){
        this.engine = engine;
    }

    public void drive(){
        engine.start();
        System.out.println("Car Number: " + carNumber);
        System.out.println("Car is running");
    }
}
