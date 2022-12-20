package com.example.adminpage.controller;

import com.example.adminpage.dto.Buy;
import com.example.adminpage.service.BuyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Api(tags = {"구매 목록 리스트"}, description = "구매 목록 관련 서비스")
@RestController
public class BuyListController {

    @Autowired
    BuyService buyService;

    @ApiOperation(value = "구매 목록 조회", notes = "총 구매 목록 리스트를 조회한다")
    @GetMapping("/selectBuy")
    public List<Buy> selectBuy() {
        return buyService.selectBuy();
    }
}
