package com.example.website.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SubscribeMapper {
    int insertSub(String email);

    List<Map<String, String>> selectSub();
}
