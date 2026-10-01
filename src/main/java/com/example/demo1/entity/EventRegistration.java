package com.example.demo1.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Table(name = "event_registrations")
@NoArgsConstructor
@Getter
@Setter
public class EventRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long eventId; // Referencia a CampusEvent

    @Column(nullable = false)
    private Long ticketTypeId; // Referencia a TicketType

    @Column(nullable = false)
    private Long attendeedId; // Referencia a User

    @Column(nullable = false)
    private ZonedDateTime registeredAt;

    @Column(nullable = false)
    private String status; // CONFIRMED, CHECKED_IN, CANCELLED
}
