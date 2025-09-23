package com.example.Simpleecommerceapp.Service;

import com.example.Simpleecommerceapp.Entity.Admin;
import com.example.Simpleecommerceapp.Entity.User;
import com.example.Simpleecommerceapp.Repository.User_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User_Service {

    @Autowired
    private User_Repo user_repo;

    public List<User> getAllUser(){
        return user_repo.findAll();
    }

    public User getUserById(Long id) {
        return user_repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin with id" + id + "not found"));
    }

    public void updateAdmin(User user){
        user_repo.findById(user.getId()).orElseThrow(() ->  new RuntimeException("ADMIN WITH ID " + user.getId() + "NOT FOUND"));
        user_repo.save(user);
    }

    public void deleteAdminById(Long id){
        user_repo.findById(id).orElseThrow(() -> new RuntimeException("ADMIN WITH ID " +id+ " NOT FOUND"));
        user_repo.deleteById(id);
    }

    public void createUser(User user){
         user_repo.save(user);
    }

    public boolean verifyCredentials(String email, String password){
        User user = user_repo.findByEmail(email);
        if (user != null && password != null && password.equals(user.getPassword())) {
            return true;
        }
        return false;
    }
}
