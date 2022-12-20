package com.example.website.mapper;

import com.example.website.dto.Payment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PaymentMapper {

    int insertPoint(Payment payment);

    List<Map<String, Object>> checkPoint(String email);
}
