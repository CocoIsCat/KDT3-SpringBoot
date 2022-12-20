package com.example.adminpage.controller;

import com.example.adminpage.dto.Admin;
import com.example.adminpage.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;


@Api(tags = {"로그인 기능"}, description = "로그인 관련 서비스")
@Controller
public class LogInController {

    @Autowired
    LoginService loginService;

    @ApiOperation(value = "사용자별 인증 정보 CHECK", notes = "인증된 사용자인지 판단하는 API입니다.")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "사용자 식별 ID", required = true),
            @ApiImplicitParam(name = "password", value = "사용자 비밀번호", required = true)
    })
    @PostMapping("/login")
    public String logIn(Admin admin,  @ApiIgnore HttpSession session){
        if(loginService.LogIn(admin, session))
            return "redirect:/goIndex";
        else
            return "redirect:/";

    }
}