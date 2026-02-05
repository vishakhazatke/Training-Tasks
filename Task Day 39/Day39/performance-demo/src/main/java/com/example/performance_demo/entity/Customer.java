package com.example.performance_demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Address> addresses;

    public Long getId() { return id; }
    public String getName() { return name; }
    public List<Address> getAddresses() { return addresses; }

    public void setName(String name) { this.name = name; }
}
