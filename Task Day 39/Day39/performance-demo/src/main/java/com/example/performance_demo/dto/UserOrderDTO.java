package com.example.performance_demo.dto;

public class UserOrderDTO {

    private final String userName;
    private final String product;

    public UserOrderDTO(String userName, String product) {
        this.userName = userName;
        this.product = product;
    }

    public String getUserName() {
        return userName;
    }
    public String getProduct() {
        return product;
    }
}
