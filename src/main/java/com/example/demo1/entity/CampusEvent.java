package com.example.demo1.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Table(name = "campus_events")
@NoArgsConstructor
@Getter
@Setter
public class CampusEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long organizedId; // Referencia a User

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

    @Column(nullable = false)
    private String status; // DRAFT, PUBLISHED, CANCELLED, FINISHED
}
