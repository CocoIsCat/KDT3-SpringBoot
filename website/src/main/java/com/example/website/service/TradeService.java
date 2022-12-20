package com.example.website.service;

import com.example.website.dto.Buy;
import com.example.website.dto.Trade;
import com.example.website.mapper.BuyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class TradeService {

    @Autowired
    BuyMapper buyMapper;
    private final PayService payService;

    public TradeService(PayService payService) {
        this.payService = payService;
    }

    public boolean checkBalance(double total, HttpSession session) {
        double cash = payService.checkCashAmount(session);
        if(cash - total >= 0) {
            return true;
        }
        else
            return false;
    }


    public void buyCoin(Buy buy, HttpSession session) {
        Trade trade = new Trade(String.valueOf(session.getAttribute("email")), buy.getCoinId(), buy.getName(), buy.getPrice(), buy.getAmount(), buy.getTotal());
        buyMapper.insertTrade(trade);
    }
}
