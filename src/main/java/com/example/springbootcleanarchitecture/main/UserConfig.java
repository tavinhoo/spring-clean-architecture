package com.example.springbootcleanarchitecture.main;

import com.example.springbootcleanarchitecture.application.gateways.UserGateway;
import com.example.springbootcleanarchitecture.application.usecases.CreateUserInteractor;
import com.example.springbootcleanarchitecture.infrastructure.controllers.UserDTOMapper;
import com.example.springbootcleanarchitecture.infrastructure.gateways.UserEntityMapper;
import com.example.springbootcleanarchitecture.infrastructure.gateways.UserRepositoryGateway;
import com.example.springbootcleanarchitecture.infrastructure.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }
}
