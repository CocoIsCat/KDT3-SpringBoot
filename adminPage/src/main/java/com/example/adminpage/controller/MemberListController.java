package com.example.adminpage.controller;

import com.example.adminpage.dto.Member;
import com.example.adminpage.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = {"회원 목록 리스트"}, description = "회원 목록 관련 서비스")
@RestController
public class MemberListController {

    @Autowired
    MemberService memberService;

    @ApiOperation(value = "회원 목록 조회", notes = "총 회원 목록 리스트를 조회한다")
    @GetMapping("/selectMember")
    public List<Member> MemberList() {
        return memberService.memberList();
    }
}
