package com.example.Simpleecommerceapp.Service;

import com.example.Simpleecommerceapp.Entity.Order;
import com.example.Simpleecommerceapp.Entity.Product;
import com.example.Simpleecommerceapp.Repository.Order_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Order_Service {

    @Autowired
    private Order_Repo order_repo;

    public List<Order> getAllOrder(){
        return order_repo.findAll();
    }

    public Order getOrderById(Long id) {
        return order_repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin with id" + id + "not found"));
    }

    public void  createOrder(Order order){
        order_repo.save(order);

    }

    public void UpdateOrder(Order order){
        order_repo.findById(order.getId()).orElseThrow(() ->  new RuntimeException("ADMIN WITH ID " + order.getId() + "NOT FOUND"));
        order_repo.save(order);
    }

    public void deleteOrder(Long id){
        order_repo.findById(id).orElseThrow(() -> new RuntimeException("ADMIN WITH ID " +id+ " NOT FOUND"));
        order_repo.deleteById(id);
    }
}
