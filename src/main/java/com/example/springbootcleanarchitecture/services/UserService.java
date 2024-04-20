package com.example.springbootcleanarchitecture.services;

import com.example.springbootcleanarchitecture.model.User;
import com.example.springbootcleanarchitecture.model.exceptions.UserNotFound;
import com.example.springbootcleanarchitecture.repositories.UserReposiitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserReposiitory userRepository;

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> findUserById(Long userId) {
        if(!userRepository.existsById(userId)) {
            throw new UserNotFound("UserNotFound");
        }
        return userRepository.findById(userId);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long userId) {
      if(!userRepository.existsById(userId)) {
          throw new UserNotFound("UserNotFound");
      }
      userRepository.deleteById(userId);
    }
}
