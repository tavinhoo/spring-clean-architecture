package com.example.springbootcleanarchitecture;

import com.example.springbootcleanarchitecture.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCleanArchitectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCleanArchitectureApplication.class, args);
	}
}
