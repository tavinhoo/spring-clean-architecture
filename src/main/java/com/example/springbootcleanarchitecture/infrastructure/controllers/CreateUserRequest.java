package com.example.springbootcleanarchitecture.infrastructure.controllers;

public record CreateUserRequest(String name, String email, String password) {

}
