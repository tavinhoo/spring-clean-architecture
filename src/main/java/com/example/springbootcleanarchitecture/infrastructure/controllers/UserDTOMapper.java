package com.example.springbootcleanarchitecture.infrastructure.controllers;

import com.example.springbootcleanarchitecture.domain.entities.User;

public class UserDTOMapper {

    CreateUserResponse toResponse(User user) {
        return new CreateUserResponse(user.name(), user.email());
    }

    public User toUser(CreateUserRequest request) {
        return new User(request.name(), request.password(), request.email());
    }
}
