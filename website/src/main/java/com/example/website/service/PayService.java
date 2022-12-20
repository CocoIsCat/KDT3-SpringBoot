package com.example.website.service;

import com.example.website.dto.Payment;
import com.example.website.dto.Trade;
import com.example.website.mapper.BuyMapper;
import com.example.website.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Service
public class PayService {

    private final BuyMapper buyMapper;

    private final PaymentMapper paymentMapper;

    @Autowired
    public PayService(PaymentMapper paymentMapper, BuyMapper buyMapper) {
        this.paymentMapper = paymentMapper;
        this.buyMapper = buyMapper;
    }

    public boolean payment(Map<String, String> paymentInfo, HttpSession session) {
        Payment payment = new Payment(String.valueOf(session.getAttribute("email")), Integer.parseInt(paymentInfo.get("amount")), paymentInfo.get("uid"));
        int result = paymentMapper.insertPoint(payment);
        if (result > 0) {
            return true;
        }
        else
            return false;
    }

    public List<Map<String, Object>> checkCharge(HttpSession session) {
        return paymentMapper.checkPoint(String.valueOf(session.getAttribute("email")));
    }

    public int checkPastAmount(HttpSession session) {
        List<Map<String, Object>> list = checkCharge(session);
        int pastAmount = 0;
        for(Map<String, Object> m : list) {
            pastAmount += (int)m.get("amount");
        }
        return pastAmount;
    }

    public double checkPresentAmount(HttpSession session) {
        double cash = checkCashAmount(session);
        double coinAmount = checkCoinAmount(session);
        return cash + coinAmount;
    }

    public double checkCashAmount(HttpSession session) {
        return checkPastAmount(session) - checkTradeAmount(session);
    }
    public List<Trade> checkTrade(HttpSession session) {
        return buyMapper.checkTrade(String.valueOf(session.getAttribute("email")));
    }

    public double checkTradeAmount(HttpSession session) {
        List<Trade> list = checkTrade(session);
        double tradeAmount = 0;
        for(Trade t : list) {
            tradeAmount += t.getTotal();
        }
        return tradeAmount;
    }

    public double checkCoinAmount(HttpSession session) {
        List<Trade> coinList = checkTrade(session);
        double result = 0;
        for (Trade t : coinList) {
            System.out.println(t.toString());
            result += t.getTotal();
        }
        return result;
    }
}
