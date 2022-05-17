package com.hillel.loginsystem.dao;

import com.hillel.loginsystem.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserDao extends MongoRepository<User, Integer> {

    Optional<User> findByUsername(String username);
}
