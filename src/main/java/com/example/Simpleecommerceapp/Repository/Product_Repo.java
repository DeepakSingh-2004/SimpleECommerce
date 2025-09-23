package com.example.Simpleecommerceapp.Repository;

import com.example.Simpleecommerceapp.Entity.Admin;
import com.example.Simpleecommerceapp.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Product_Repo extends JpaRepository<Product, Long> {

        public Product findByName(String name);;
    }

