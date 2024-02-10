package com.example.carrentalproject.dto;

import com.example.carrentalproject.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String username;
    private String password;
    private String email;
    private UserRole userRole;
}
