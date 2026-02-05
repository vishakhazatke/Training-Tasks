package com.example.performance_demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Long getId() { return id; }
    public String getProduct() { return product; }
    public User getUser() { return user; }

    public void setProduct(String product) { this.product = product; }
    public void setUser(User user) { this.user = user; }
}
