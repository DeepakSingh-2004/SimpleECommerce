package com.example.Simpleecommerceapp.Controller1;

import com.example.Simpleecommerceapp.Entity1.UserEntity;
import com.example.Simpleecommerceapp.Repository1.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    // Register API
    @PostMapping("/register")
    public String register(@RequestBody UserEntity userEntity) {
        userRepo.save(userEntity);
        return "USER REGISTERED SUCCESSFULLY";
    }

    // Login API
    @PostMapping("/login")
    public String login(@RequestBody UserEntity loginUser) {
        UserEntity userEntity = userRepo.findByUsername(loginUser.getUsername());
        if (userEntity != null && userEntity.getPassword().equals(loginUser.getPassword())) {
            return "Login Successfully";
        }
        return "Invalid username or password!";
    }
}
