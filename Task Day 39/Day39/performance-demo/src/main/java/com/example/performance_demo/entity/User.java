package com.example.performance_demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(
        name = "users",
        indexes = @Index(name = "idx_user_name", columnList = "name")
)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Order> orders;

    public Long getId() { return id; }
    public String getName() { return name; }
    public List<Order> getOrders() { return orders; }

    public void setName(String name) { this.name = name; }
}
