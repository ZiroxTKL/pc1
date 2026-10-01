package com.example.demo1.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;

import java.time.ZonedDateTime;

public class EventsRequestDTO {

    @Column(nullable = false)
    private String title;

    @Size(max = 500)
    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String category; // ACADEMIC, CULTURAL, SPORTS, TECHNOLOGY

    @Column(nullable = false)
    private ZonedDateTime eventDate;

    @Column(nullable = false)
    private String location;

}
