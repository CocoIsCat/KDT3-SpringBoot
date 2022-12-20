package com.example.adminpage.controller;

import com.example.adminpage.dto.Payment;
import com.example.adminpage.service.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = {"충전 목록 리스트"}, description = "충전 목록 관련 서비스")
@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @ApiOperation(value = "충전 목록 조회", notes = "총 충전 목록 리스트를 조회한다")
    @GetMapping("/selectPayment")
    public List<Payment> selectPayment() {
        return paymentService.selectPayment();
    }
}
