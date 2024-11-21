package com.example.User.controller.homecontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {

    @GetMapping("/home")
    public String homepage(){
        return "This is my Home page.";
    }

    @GetMapping("/login")
    public String loginpage(){
        return "This is my Login page.";
    }

    @GetMapping("/register")
    public String registerpage(){
        return "This is my register page.";
    }
}
