package com.rishav.trailconnect.service;

import com.rishav.trailconnect.dto.UserRegistrationRequest;
import com.rishav.trailconnect.dto.UserResponse;
import com.rishav.trailconnect.entity.users;
import com.rishav.trailconnect.enums.Role;
import com.rishav.trailconnect.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
public UserServiceImpl(UserRepository userRepository) {
    this.userRepository=userRepository;
}

@Override
    public String testService(){
    return "service working ok";
}
@Override
    public UserResponse registerUser(UserRegistrationRequest request){
      users user=new users();
      user.setUsername(request.getUserName());
      user.setPassword(request.getPassword());
      user.setEmail(request.getEmail());

      user.setRole(Role.USER);

      userRepository.save(user);
    user.setBio("");

    user.setProfileImage(null);

    user.setCreatedAt(LocalDateTime.now());

    user.setUpdatedAt(LocalDateTime.now());

      UserResponse response=new UserResponse();
      response.setId(user.getId());
      response.setUserName(user.getUsername());
      response.setEmail(user.getEmail());
      return response;
}
}
