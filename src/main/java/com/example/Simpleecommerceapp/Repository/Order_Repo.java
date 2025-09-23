package com.example.Simpleecommerceapp.Repository;

import com.example.Simpleecommerceapp.Entity.Order;
import com.example.Simpleecommerceapp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Order_Repo extends JpaRepository<Order, Long> {

    public Order findByUser(User user);
}
