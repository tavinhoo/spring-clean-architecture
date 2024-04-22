package com.example.springbootcleanarchitecture.application.usecases;

import com.example.springbootcleanarchitecture.application.gateways.UserGateway;
import com.example.springbootcleanarchitecture.domain.entities.User;

// Implementa a interface(como um service)
public class CreateUserInteractor {

    private UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    // Definindo este método, é necessário criar um acesso ao repository
    // Criação de uma interface pra se comunicar com as camadas externas
    // application/gateways/UserGateway.java
    public User createUser(User user) {
        return userGateway.createUser(user);
    }
}
