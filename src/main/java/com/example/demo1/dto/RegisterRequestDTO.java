package com.example.demo1.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;

public class RegisterRequestDTO {
    @Column(nullable = false, unique = true)
    private String username;

    @Email
    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password; // Encriptado
}
