package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public void save(){
        System.out.println("User saved to database");
    }
}
