package com.example.adminpage.service;

import com.example.adminpage.repository.BuyRepository;
import com.example.adminpage.repository.ContactRepository;
import com.example.adminpage.repository.MemberRepository;
import com.example.adminpage.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {

    @Autowired
    MemberRepository memberRepository;
    @Autowired
    PaymentRepository paymentRepository;
    @Autowired
    BuyRepository buyRepository;
    @Autowired
    ContactRepository contactRepository;

    public int memberCount() {
        return memberRepository.memberCount();
    }

    public int paymentAmount() {
        return paymentRepository.paymentAmount();
    }

    public int buyCount() {
        return buyRepository.cntBuy();
    }

    public int contactCount() {
        return contactRepository.cntContact();
    }
}
