package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

@Repository
public interface EventRegistration extends JpaRepository<EventRegistration, Long> {
}
