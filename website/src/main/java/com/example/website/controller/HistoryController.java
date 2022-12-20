package com.example.website.controller;

import com.example.website.dto.Payment;
import com.example.website.dto.Trade;
import com.example.website.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
public class HistoryController {

    @Autowired
    PayService payService;

    @GetMapping("/buyList")
    public List<Trade> buyList(HttpSession session) {
        return payService.checkTrade(session);
    }

    @GetMapping("/pointList")
    public List<Map<String, Object>> pointList(HttpSession session) {
        return payService.checkCharge(session);
    }

    @GetMapping("/hadBalance")
    public double hadBalance(HttpSession session) {
        return payService.checkPastAmount(session);
    }

    @GetMapping("//havingBalance")
    public List<Trade> havingBalance(HttpSession session) {
        return payService.checkTrade(session);
    }
    @GetMapping("/moneyBalance")
    public double moneyBalance(HttpSession session) {
        return payService.checkCashAmount(session);
    }

}
