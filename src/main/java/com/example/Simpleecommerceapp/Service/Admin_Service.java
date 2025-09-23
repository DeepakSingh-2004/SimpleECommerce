package com.example.Simpleecommerceapp.Service;

import com.example.Simpleecommerceapp.Entity.Admin;
import com.example.Simpleecommerceapp.Entity.User;
import com.example.Simpleecommerceapp.Repository.Admin_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Admin_Service {

    @Autowired
    private Admin_Repo admin_repo;

    public List<Admin> getAllAdmin(){
        return admin_repo.findAll();
    }

    public Admin getAdminById(Long id) {
       return admin_repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin with id" + id + "not found"));
    }

    public void createUser(Admin admin){
        admin_repo.save(admin);
    }

    public void updateAdmin(Admin admin){
        admin_repo.findById(admin.getId()).orElseThrow(() ->  new RuntimeException("ADMIN WITH ID " + admin.getId() + "NOT FOUND"));
        admin_repo.save(admin);
    }

    public void deleteAdminById(Long id){
        admin_repo.findById(id).orElseThrow(() -> new RuntimeException("ADMIN WITH ID " +id+ " NOT FOUND"));
        admin_repo.deleteById(id);
    }

    public boolean verifyCredentials(String email, String password){
      Admin admin = admin_repo.findByEmail(email);
      if(admin.getPassword() == password){
          return true;
      }return  false;
    }
}
