package com.example.springormdemo;

import com.example.springormdemo.jdbc.JdbcEmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringormdemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringormdemoApplication.class, args);
	}

	@Bean
	CommandLineRunner initJdbc(JdbcEmployeeRepository repo){
		return args -> repo.createTableIfNotExists();
	}

}
