package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Employee e1 = context.getBean("empSetter", Employee.class);
        Employee e2 = context.getBean("empSetter", Employee.class);

        e1.display();

      Employee e3 = context.getBean("empConstructor", Employee.class);
      e3.display();

        System.out.println(e1 == e2);
        context.close();
    }
}
