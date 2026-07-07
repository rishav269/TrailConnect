package com.rishav.trailconnect.controller;

import com.rishav.trailconnect.dto.UserRegistrationRequest;
import com.rishav.trailconnect.dto.UserResponse;
import com.rishav.trailconnect.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class userController {
     private  UserService userService;
     userController(UserService userService) {
        this.userService = userService;

     }
     @GetMapping("/test")
     public String test() {
         return userService.testService();
     }
     @PostMapping("/register")
    public UserResponse userRegistration(@RequestBody UserRegistrationRequest request){
         return userService.registerUser(request);
     }

}
