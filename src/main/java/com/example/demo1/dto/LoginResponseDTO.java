package com.example.demo1.dto;

import org.springframework.beans.factory.annotation.Value;

public class LoginResponseDTO {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration-access}")
    private Long accessTokenExpiration;
}
