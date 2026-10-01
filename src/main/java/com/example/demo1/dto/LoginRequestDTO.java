package com.example.demo1.dto;

import jakarta.persistence.Column;

public class LoginRequestDTO {

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;
}
