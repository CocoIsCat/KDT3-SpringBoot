package com.example.adminpage.mapper;

import com.example.adminpage.dto.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface AdminMapper {

    Admin selectAdmin(Admin admin);
}
