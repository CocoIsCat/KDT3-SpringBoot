package com.example.website.mapper;

import com.example.website.dto.Trade;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BuyMapper {

    int insertTrade(Trade trade);

    List<Trade> checkTrade(String email);
}
