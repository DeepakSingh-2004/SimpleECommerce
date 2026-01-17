package com.example.Simpleecommerceapp.LoginController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class PageController {

        @GetMapping("/login")
        public String loginPage() {
            return "login"; // will look for login.html in templates
        }

        @GetMapping("/register")
        public String registerPage() {
            return "register"; // will look for register.html in templates
        }
    }


