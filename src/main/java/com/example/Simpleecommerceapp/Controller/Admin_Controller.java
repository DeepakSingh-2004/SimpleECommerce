package com.example.Simpleecommerceapp.Controller;

import com.example.Simpleecommerceapp.Entity.Admin;
import com.example.Simpleecommerceapp.Service.Admin_Service;
import com.example.Simpleecommerceapp.Service.Order_Service;
import com.example.Simpleecommerceapp.Service.Product_Service;
import com.example.Simpleecommerceapp.Service.User_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController //(Combines @Controller + @ResponseBody)
@RequestMapping("")
public class Admin_Controller {

    @Autowired
    private Admin_Service admin_service;

    @Autowired
    private User_Service user_service;

    @Autowired
    private Order_Service order_service;

    @Autowired
    private Product_Service product_service;

    @GetMapping
    public String verifyCredentials(@ModelAttribute("admin") Admin admin, Model model) {
        if (admin_service.verifyCredentials(admin.getEmail(), admin.getPassword())) {
            return "/admin/home";
        }
        model.addAttribute("error", "Invalid email or password");
            return "login";
    }

    @GetMapping("/admin/home")
    public String adminHomePage(Model model){
       model.addAttribute("adminList", admin_service.getAllAdmin());
       model.addAttribute("userList", user_service.getAllUser());
       model.addAttribute("orderList", order_service.getAllOrder());
       model.addAttribute("product List", product_service.getAllProduct());

         return "AdminHomePage";
    }

    @GetMapping("/add/admin")
    public String createAdmin(){
        return "AddAdmin";
    }

    @PostMapping("/add/admin/{id}")
    public String createAdminById(Admin admin){
        admin_service.createUser(admin);

        return "/admin/home";
    }

    @GetMapping("/add/admin/{id}")
    public String createAdmin(@PathVariable Long id, Model model){
        model.addAttribute("admin", admin_service.getAdminById(id));

        return "updateAdmin";
    }

    @PostMapping("/update/admin")
    public String updateAdmin(Admin admin){
        admin_service.updateAdmin(admin);

        return "/admin/home";
    }

    @DeleteMapping("/delete/admin/{id}")
    public String deleteAdminById(@PathVariable Long id){
        admin_service.deleteAdminById(id);

        return "/admin/home";
    }
}
