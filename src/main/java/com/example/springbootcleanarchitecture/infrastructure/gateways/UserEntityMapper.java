package com.example.springbootcleanarchitecture.infrastructure.gateways;

import com.example.springbootcleanarchitecture.domain.entities.User;
import com.example.springbootcleanarchitecture.infrastructure.persistence.UserEntity;

public class UserEntityMapper {

    UserEntity toEntity(User userDomainObj) {
        return new UserEntity(
                userDomainObj.name(),
                userDomainObj.email(),
                userDomainObj.password()
        );
    }

    User toDomainObj(UserEntity userEntity) {
        return new User(userEntity.getName(), userEntity.getEmail(), userEntity.getPassword());
    }
}
