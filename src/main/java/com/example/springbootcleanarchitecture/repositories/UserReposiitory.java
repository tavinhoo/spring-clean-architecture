package com.example.springbootcleanarchitecture.repositories;

import com.example.springbootcleanarchitecture.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReposiitory extends JpaRepository<User, Long> {
}
