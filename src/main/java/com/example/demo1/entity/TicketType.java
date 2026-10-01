package com.example.demo1.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ticket_types")
@NoArgsConstructor
@Getter
@Setter
public class TicketType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long eventId; // Referencia a CampusEvent

    @Column(nullable = false)
    private String name;

    @Min(1)
    @Column(nullable = false)
    private Integer capacity;

    @Column(nullable = false)
    private Integer registeredCount = 0;

    @Column(nullable = false)
    private String status; // AVAILABLE, FULL, INACTIVE
}
