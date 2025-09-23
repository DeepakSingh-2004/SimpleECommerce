package com.example.Simpleecommerceapp.Repository;

import com.example.Simpleecommerceapp.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Admin_Repo extends JpaRepository<Admin, Long>{

    public Admin findByEmail(String email);
}
