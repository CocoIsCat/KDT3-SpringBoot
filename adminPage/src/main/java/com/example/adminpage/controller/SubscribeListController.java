package com.example.adminpage.controller;

import com.example.adminpage.dto.Subscribe;
import com.example.adminpage.service.SubscribeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = {"구독 목록 리스트"}, description = "구독 목록 관련 서비스")
@RestController
public class SubscribeListController {

    @Autowired
    SubscribeService subscribeService;

    @ApiOperation(value = "구독 목록 조회", notes = "총 구독 목록 리스트를 조회한다")
    @GetMapping("/selectSubscribe")
    public List<Subscribe> selectSubscribe() {
        return subscribeService.selectSubscribe();
    }
}
