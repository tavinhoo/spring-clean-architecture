package com.example.springbootcleanarchitecture.config;

import com.example.springbootcleanarchitecture.model.User;
import com.example.springbootcleanarchitecture.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User("João", "joao@example.com", "senha123");
        User user2 = new User("Maria", "maria@example.com", "senha456");
        User user3 = new User("Pedro", "pedro@example.com", "senha789");
        User user4 = new User("Ana", "ana@example.com", "senha101112");
        User user5 = new User("Lucas", "lucas@example.com", "senha131415");

        userService.saveUser(user1);
        userService.saveUser(user2);
        userService.saveUser(user3);
        userService.saveUser(user4);
        userService.saveUser(user5);

    }

}
