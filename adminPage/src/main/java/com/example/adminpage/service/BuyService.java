package com.example.adminpage.service;

import com.example.adminpage.dto.Buy;
import com.example.adminpage.repository.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyService {

    @Autowired
    BuyRepository buyRepository;

    public List<Buy> selectBuy() {
        return buyRepository.selectBuy();
    }
}
