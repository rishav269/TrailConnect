package com.rishav.trailconnect.service;

import com.rishav.trailconnect.dto.UserRegistrationRequest;
import com.rishav.trailconnect.dto.UserResponse;

public interface UserService {
    String testService();

    UserResponse registerUser(UserRegistrationRequest request);
}
