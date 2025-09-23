package com.example.Simpleecommerceapp.Controller;

import com.example.Simpleecommerceapp.Service.Product_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Product_Controller {

    @Autowired
    private Product_Service product_service;

}
