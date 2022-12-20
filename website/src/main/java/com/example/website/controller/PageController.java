package com.example.website.controller;

import com.example.website.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PageController {

    private final PayService payService;

    @Autowired
    public PageController(PayService payService) {
        this.payService = payService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/goSignup")
    public String goSignUP() {
        return "signup";
    }

    @GetMapping("/goLogin")
    public String goLogin() {
        return "login";
    }

    @GetMapping("/goPay")
    public String goPay(HttpSession session) {
        if (session.getAttribute("email") != null)
            return "pay";
        else
            return "redirect:/goLogin";
    }

    @GetMapping("/goMarket")
    public String goMarket(HttpSession session) {
        if (session.getAttribute("email") != null)
            return "market";
        else
            return "redirect:/goLogin";
    }

    @GetMapping("/goHistory")
    public String goHistory(HttpSession session, Model model) {
        if (session.getAttribute("email") != null) {
            return "history";
        }
        else
            return "redirect:/goLogin";
    }
}
