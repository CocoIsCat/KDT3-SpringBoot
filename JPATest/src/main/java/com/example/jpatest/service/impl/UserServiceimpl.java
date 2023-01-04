package com.example.jpatest.service.impl;

import com.example.jpatest.dto.UserRequest;
import com.example.jpatest.entity.User;
import com.example.jpatest.repository.UserRepository;
import com.example.jpatest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceimpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public String insertUser(UserRequest userRequest) {

        try {
            userRepository.save(userRequest.toEntity());
        } catch (Exception e) {
            return "failed";
        }
        return "success";
    }

    @Override
    public String selectUser(UserRequest userRequest) {

        User user = userRepository.findByEmailAndPassword(userRequest.getEmail(), userRequest.getPassword()).orElse(null);
        if (user != null) {
            return "success";
        } else {
            return "failed";
        }
    }
}
