package com.example.website.controller;

import com.example.website.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class PayController {

    private final PayService payService;
    @Autowired
    public PayController(PayService payService) {
        this.payService = payService;
    }

    @GetMapping("/point")
    public void point(@RequestParam Map<String, String> paymentInfo, HttpSession session) {
        payService.payment(paymentInfo, session);
    }
}
