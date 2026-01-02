package com.example.spring;

public class Address {

    private String city;

    public Address(String city){
        this.city = city;
    }

    @Override
    public String toString() {
        return city;
    }
}
