package com.example.springbootcleanarchitecture.model.exceptions;

public class UserNotFound extends RuntimeException {
    public UserNotFound(String msg) {
        super(msg);
    }
}
