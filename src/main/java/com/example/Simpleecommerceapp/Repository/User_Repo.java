package com.example.Simpleecommerceapp.Repository;

import com.example.Simpleecommerceapp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_Repo extends JpaRepository<User, Long> {

    public User findByEmail(String email);
}
