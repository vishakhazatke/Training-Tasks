package com.example.performance_demo.entity;

import jakarta.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    public Long getId() {
        return id;
    }
    public String getCity() {
        return city;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
