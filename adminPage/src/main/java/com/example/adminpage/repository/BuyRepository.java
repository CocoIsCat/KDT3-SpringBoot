package com.example.adminpage.repository;

import com.example.adminpage.dto.Buy;
import com.example.adminpage.mapper.BuyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BuyRepository {
    @Autowired
    BuyMapper buyMapper;
    public int cntBuy() {
        return buyMapper.cntBuy();
    }

    public List<Buy> selectBuy() {
        return buyMapper.selectBuy();
    }
}
