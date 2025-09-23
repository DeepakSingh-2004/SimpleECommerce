package com.example.Simpleecommerceapp.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
@Entity  //Marks this class as a JPA Entity.
@Table (name = "admins")   //Specifies which table name in the database this entity should map to.
public class Admin {

    @Id   //Marks the primary key field of the table.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @Value("qwerty")
    private String password;
}
