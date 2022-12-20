package com.example.website.mapper;

import com.example.website.dto.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface MemberMapper {

    Map<String, String> selectMember(String email);

    String checkMember(String email);

    int insertMember(Member member);
}
