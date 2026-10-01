package com.example.demo1.controller;

import com.example.demo1.service.EventRegistrationService;
import com.example.demo1.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventRegistrationService userService;

    public EventController(EventRegistrationService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public String createEvent() {
        return "";
    }
}
