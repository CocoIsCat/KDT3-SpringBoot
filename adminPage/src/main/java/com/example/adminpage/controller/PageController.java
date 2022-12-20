package com.example.adminpage.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Api(tags = {"페이지 전환"}, description = "페이지 전환 관련 서비스")
@Controller
public class PageController {

    @ApiOperation(value = "로그인 페이지 이동", notes = "로그인 페이지로 이동한다")
    @GetMapping("/")
    public String goLogIn(HttpSession session) {
        return "login";
    }

    @ApiOperation(value = "인덱스 페이지 이동", notes = "인덱스 페이지로 이동한다")
    @GetMapping("/goIndex")
    public String goIndex() {
        return "index";
    }

    @ApiOperation(value = "회원 페이지 이동", notes = "회원 페이지로 이동한다")
    @GetMapping("/goMember")
    public String goMemger() {
        return "memberList";
    }

    @ApiOperation(value = "충전 목록 페이지 이동", notes = "충전 목록 페이지로 이동한다")
    @GetMapping("/goPayment")
    public String goPayment() {
        return "paymentList";
    }

    @ApiOperation(value = "구매 목록 페이지 이동", notes = "구매 목록 페이지로 이동한다")
    @GetMapping("/goBuy")
    public String goBuy() {
        return "buyList";
    }

    @ApiOperation(value = "문의 목록 페이지 이동", notes = "문의 목록 페이지로 이동한다")
    @GetMapping("/goContact")
    public String goContact() {
        return "contactList";
    }

    @ApiOperation(value = "구독 목록 페이지 이동", notes = "구독 목록 페이지로 이동한다")
    @GetMapping("/goSubscribe")
    public String goSubscribe() {
        return "subscribeList";
    }
}
