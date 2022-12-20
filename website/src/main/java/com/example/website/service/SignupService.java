package com.example.website.service;

import com.example.website.dto.Member;
import com.example.website.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupService {

    private final MemberMapper memberMapper;

    @Autowired
    public SignupService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public boolean signUp(Member member) {
        if (checkDuplicate(member.getEmail())) {
            return false;
        }
        int result = memberMapper.insertMember(member);
        if(result > 0)
            return true;
        else
            return false;

    }

    public boolean checkDuplicate(String email) {
        if (memberMapper.checkMember(email) != null) {
            return true;
        }
        return false;
    }
}
