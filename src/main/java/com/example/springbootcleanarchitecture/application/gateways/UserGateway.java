package com.example.springbootcleanarchitecture.application.gateways;
import com.example.springbootcleanarchitecture.domain.entities.User;


public interface UserGateway {
    User createUser(User user);
}
