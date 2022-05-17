package com.hillel.loginsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private int age;
    private double salary;

}
