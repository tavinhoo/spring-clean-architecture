package com.example.springbootcleanarchitecture.controllers;

import com.example.springbootcleanarchitecture.model.User;
import com.example.springbootcleanarchitecture.model.exceptions.UserNotFound;
import com.example.springbootcleanarchitecture.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity<List<? extends Object>> getAllUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.findAllUsers());
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<? extends Object> getOneUser(@PathVariable(value = "id") Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(userService.findUserById(id).get());
        } catch (UserNotFound e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @PostMapping("/user")
    public ResponseEntity<? extends Object> createUser(User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(user));
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<? extends Object> deleteUser(@PathVariable(value = "id") Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body("User has been deleted!");
        } catch (UserNotFound e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}
