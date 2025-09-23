package com.example.Simpleecommerceapp.Controller;

import com.example.Simpleecommerceapp.Service.Order_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Order_Controller {

    @Autowired
    private Order_Service order_service;

}
