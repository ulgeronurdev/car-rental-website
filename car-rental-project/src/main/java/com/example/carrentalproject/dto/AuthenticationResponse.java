package com.example.carrentalproject.dto;

import com.example.carrentalproject.enums.UserRole;
import lombok.Data;

@Data
public class AuthenticationResponse {

    private String jwt;
    private UserRole userRole;
    private Long id;
}
