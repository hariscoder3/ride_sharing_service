package com.codingshuttle.project.uber.RideApp.services;

import com.codingshuttle.project.uber.RideApp.dto.DriverDto;
import com.codingshuttle.project.uber.RideApp.dto.SignupDto;
import com.codingshuttle.project.uber.RideApp.dto.UserDto;

public interface AuthService {

    String[] login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId, String vehicleId);

    String refreshToken(String refreshToken);
}
