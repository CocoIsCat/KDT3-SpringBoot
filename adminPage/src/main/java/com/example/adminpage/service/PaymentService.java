package com.example.adminpage.service;

import com.example.adminpage.dto.Payment;
import com.example.adminpage.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public List<Payment> selectPayment() {
        List<Payment> result = paymentRepository.selectPayment();
        for(Payment p : result) {
            p.toString();
        }
        return result;
    }
}
