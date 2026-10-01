package com.example.demo1.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class EventsResponsesDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String category; // ACADEMIC, CULTURAL, SPORTS, TECHNOLOGY

    @Column(nullable = false)
    private String status; // DRAFT, PUBLISHED, CANCELLED, FINISHED
}
