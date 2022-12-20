package com.example.adminpage.repository;

import com.example.adminpage.dto.Member;
import com.example.adminpage.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberRepository {

    @Autowired
    MemberMapper memberMapper;

    public int memberCount() {
        return memberMapper.memberCount();
    }

    public List<Member> memberList() {
        return memberMapper.memberList();
    }
}
