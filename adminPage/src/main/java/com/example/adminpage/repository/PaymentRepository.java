package com.example.adminpage.repository;

import com.example.adminpage.dto.Payment;
import com.example.adminpage.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentRepository {

    @Autowired
    PaymentMapper paymentMapper;

    public int paymentAmount() {
        return paymentMapper.paymentAmount();
    }

    public List<Payment> selectPayment() {
        return paymentMapper.selectPayment();
    }
}
