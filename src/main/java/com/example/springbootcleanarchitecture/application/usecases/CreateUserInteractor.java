package com.example.springbootcleanarchitecture.application.usecases;

import com.example.springbootcleanarchitecture.application.gateways.UserGateway;
import com.example.springbootcleanarchitecture.domain.entities.User;

public class CreateUserInteractor {

    private UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user) {
        return userGateway.createUser(user);
    }
}
