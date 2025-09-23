package com.example.Simpleecommerceapp.Repository1;

import com.example.Simpleecommerceapp.Entity1.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
