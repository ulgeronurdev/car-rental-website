package com.example.carrentalproject.services.auth;

import com.example.carrentalproject.dto.SignUpRequest;
import com.example.carrentalproject.dto.UserDto;

public interface AuthService {

    UserDto createCustomer(SignUpRequest signUpRequest);

    boolean hasCustomerWithEmail(String email);

}
