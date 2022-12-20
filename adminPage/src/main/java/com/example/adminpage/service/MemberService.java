package com.example.adminpage.service;

import com.example.adminpage.dto.Member;
import com.example.adminpage.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public List<Member> memberList() {
        return memberRepository.memberList();
    }
}
