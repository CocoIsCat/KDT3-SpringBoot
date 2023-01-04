package com.example.jpatest.controller;

import com.example.jpatest.dto.UserRequest;
import com.example.jpatest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @PostMapping("/users")
    public String insertUser(UserRequest userRequest) {
        return userService.insertUser(userRequest);
    }

    @PostMapping("/login")
    public String login(UserRequest userRequest, HttpSession session) {
        String response = userService.selectUser(userRequest);
        if (response.equals("success")) {
            session.setAttribute("email", userRequest.getEmail());
        }
        return response;
    }
}
