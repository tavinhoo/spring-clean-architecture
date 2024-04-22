package com.example.springbootcleanarchitecture.infrastructure.gateways;

import com.example.springbootcleanarchitecture.application.gateways.UserGateway;
import com.example.springbootcleanarchitecture.domain.entities.User;
import com.example.springbootcleanarchitecture.infrastructure.persistence.UserEntity;
import com.example.springbootcleanarchitecture.infrastructure.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity savedObj = userRepository.save(userEntity);
        return userEntityMapper.toDomainObj(savedObj);
    }
}
