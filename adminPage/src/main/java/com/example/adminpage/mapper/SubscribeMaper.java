package com.example.adminpage.mapper;

import com.example.adminpage.dto.Subscribe;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SubscribeMaper {
    List<Subscribe> selectSubscribe();
}
