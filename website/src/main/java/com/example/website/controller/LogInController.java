package com.example.website.controller;

import com.example.website.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LogInController {

    private final LoginService loginService;

    @Autowired
    public LogInController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public String login(@RequestParam Map<String, String> loginInfo, HttpSession session) {
        if(loginService.login(loginInfo, session))
            return "redirect:/";
        else
            return "redirect:/goLogin";
    }
}
