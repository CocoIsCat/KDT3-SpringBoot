package com.example.adminpage.controller;

import com.example.adminpage.service.IndexService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"메인 페이지"}, description = "메인 페이지 관련 서비스")
@RestController
public class IndexController {

    @Autowired
    IndexService indexService;

    @ApiOperation(value = "회원 목록 조회", notes = "총 회원 목록 리스트를 조회한다")
    @GetMapping("/selectCntMember")
    public Integer cntMember() {
        return indexService.memberCount();
    }

    @ApiOperation(value = "충전 목록 조회", notes = "총 충전 목록 리스트를 조회한다")
    @GetMapping("/selectAmountPayment")
    public Integer paymentAmount() {
        return indexService.paymentAmount();
    }

    @ApiOperation(value = "구매 목록 조회", notes = "총 구매 목록 리스트를 조회한다")
    @GetMapping("/selectCntBuy")
    public Integer cntBuy() {
        return indexService.buyCount();
    }

    @ApiOperation(value = "문의 목록 조회", notes = "총 문의 목록 리스트를 조회한다")
    @GetMapping("/selectCntContact")
    public Integer cntContact() {
        return indexService.contactCount();
    }
}
