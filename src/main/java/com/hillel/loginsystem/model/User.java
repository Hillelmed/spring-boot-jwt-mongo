package com.hillel.loginsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hillel.loginsystem.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Document(value = "user")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String username;
    @JsonIgnore
    private String password;
    private int age;
    private double salary;

    public User(UserDto user, BCryptPasswordEncoder bcryptEncoder) {
        this.setUsername(user.getUsername());
        this.setFirstName(user.getFirstName());
        this.setLastName(user.getLastName());
        this.setPassword(bcryptEncoder.encode(user.getPassword()));
        this.setAge(user.getAge());
        this.setSalary(user.getSalary());

    }

}
