package com.example.Simpleecommerceapp.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double price;

    private int quantity;

    private Date date;

    private double amount;

    @ManyToOne
    @JoinColumn (name = "userid")
    private User user;
}
