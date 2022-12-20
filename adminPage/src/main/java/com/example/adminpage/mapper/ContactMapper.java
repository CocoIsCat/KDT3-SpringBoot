package com.example.adminpage.mapper;

import com.example.adminpage.dto.Contact;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ContactMapper {
    int cntContact();

    List<Contact> selectContact();
}
