package com.example.website.controller;

import com.example.website.dto.Member;
import com.example.website.service.LoginService;
import com.example.website.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    private final SignupService signupService;

    @Autowired
    public SignUpController(SignupService signupService) {
        this.signupService = signupService;
    }

    @PostMapping("/signup")
    public String signup(Member member) {
        if(signupService.signUp(member))
            return "redirect:/goLogin";
        else
            return "redirect:/";
    }
}
