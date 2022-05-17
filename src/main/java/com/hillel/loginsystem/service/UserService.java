package com.hillel.loginsystem.service;

import com.hillel.loginsystem.model.User;
import com.hillel.loginsystem.dto.UserDto;

import java.util.List;

public interface UserService {

    User createUser(UserDto user);

    List<User> findAll();

    void delete(int id);

    User findByUserName(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
}
