package com.example.Simpleecommerceapp.Service;

import com.example.Simpleecommerceapp.Entity.Product;
import com.example.Simpleecommerceapp.Entity.User;
import com.example.Simpleecommerceapp.Repository.Product_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Product_Service {

    @Autowired
    private Product_Repo product_repo;

    public List<Product> getAllProduct(){
        return product_repo.findAll();
    }

    public Product getProductById(Long id) {
        return product_repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin with id" + id + "not found"));
    }

    public void  createProduct(Product product){
        product_repo.save(product);

    }

    public void UpdateProduct(Product product){
        product_repo.findById(product.getId()).orElseThrow(() ->  new RuntimeException("ADMIN WITH ID " + product.getId() + "NOT FOUND"));
        product_repo.save(product);
    }

    public void deleteProduct(Long id){
        product_repo.findById(id).orElseThrow(() -> new RuntimeException("ADMIN WITH ID " +id+ " NOT FOUND"));
        product_repo.deleteById(id);
    }

}
