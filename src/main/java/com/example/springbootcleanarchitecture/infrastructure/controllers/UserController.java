package com.example.springbootcleanarchitecture.infrastructure.controllers;

import com.example.springbootcleanarchitecture.application.usecases.CreateUserInteractor;
import com.example.springbootcleanarchitecture.domain.entities.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private CreateUserInteractor createUserInteractor;
    private UserDTOMapper userDTOMapper;

    public UserController(CreateUserInteractor createUserInteractor) {
        this.createUserInteractor = createUserInteractor;
        this.userDTOMapper = userDTOMapper;
    }

    @PostMapping("/user")
    public CreateUserResponse create(@RequestBody CreateUserRequest request) {
        User userBusinessObj = userDTOMapper.toUser(request);
        User user =  createUserInteractor.createUser(userBusinessObj);
        return userDTOMapper.toResponse(user);
    }
}
