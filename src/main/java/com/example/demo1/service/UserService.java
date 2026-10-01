package com.example.demo1.service;

import com.example.demo1.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserService(UserRepository userRepository,
                       ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public Object registerUser() {
        return userRepository.findById(1L);
    }

    public Object loginUser() {
        return userRepository.findByEmailAndPassword("user@example.com", "password");
    }

}
