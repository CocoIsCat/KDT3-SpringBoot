package com.example.adminpage.mapper;

import com.example.adminpage.dto.Payment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentMapper {

    int paymentAmount();

    List<Payment> selectPayment();
}
