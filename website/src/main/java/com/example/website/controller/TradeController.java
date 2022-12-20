package com.example.website.controller;

import com.example.website.dto.Buy;
import com.example.website.service.PayService;
import com.example.website.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TradeController {

    @Autowired
    TradeService tradeService;

    @GetMapping("/checkBalance")
    public Object checkBalanse(@RequestParam double total, HttpSession session) {
        if (session.getAttribute("email") == null) {
            return "loogin";
        } else {
            if (tradeService.checkBalance(total, session))
                return "can";
            else
                return "cannot";
        }
    }

    @PostMapping("/buyCoin")
    public void buyCoin(Buy buy, HttpSession session) {
        tradeService.buyCoin(buy, session);
    }
}
