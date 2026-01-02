package com.example.spring;

public class Employee {

    private int id;
    private String name;
    private Address address;

    public Employee(){
        System.out.println("Employee default constructor called");
    }
    public Employee(int id, String name, Address address){
        System.out.println("Employee parameterized constructor called");
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public void init(){
        System.out.println("Init method called");
    }

    public void destroy(){
        System.out.println("destroy method called");
    }
    public void display(){
        System.out.println(id + " " + name + " " + address);
    }

}
