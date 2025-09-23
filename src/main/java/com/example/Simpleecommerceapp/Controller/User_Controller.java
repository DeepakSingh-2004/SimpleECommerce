package com.example.Simpleecommerceapp.Controller;

import com.example.Simpleecommerceapp.Service.User_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class User_Controller {

    @Autowired
    private User_Service user_service;

}
