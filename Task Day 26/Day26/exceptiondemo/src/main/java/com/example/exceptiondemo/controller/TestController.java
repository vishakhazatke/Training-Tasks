package com.example.exceptiondemo.controller;

import com.example.exceptiondemo.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/items/{id}")
    public String getItem(@PathVariable int id){

        if(id <= 0){
            throw new ResourceNotFoundException("Item not found");
        }

        return "Item id " + id + " found";
    }
}
