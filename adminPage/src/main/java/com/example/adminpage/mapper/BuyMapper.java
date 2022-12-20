package com.example.adminpage.mapper;

import com.example.adminpage.dto.Buy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BuyMapper {
    int cntBuy();

    List<Buy> selectBuy();
}
