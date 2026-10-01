package com.example.demo1.controller;

import com.example.demo1.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String registerUser() {
        return (String) userService.registerUser();
    }

    @PostMapping("/login")
    public String loginUser() {
        return (String) userService.loginUser();
    }
}
