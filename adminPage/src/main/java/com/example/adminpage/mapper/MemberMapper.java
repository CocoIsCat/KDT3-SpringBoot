package com.example.adminpage.mapper;

import com.example.adminpage.dto.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    int memberCount();

    List<Member> memberList();
}
