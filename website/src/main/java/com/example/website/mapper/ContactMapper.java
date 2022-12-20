package com.example.website.mapper;

import com.example.website.dto.Contact;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContactMapper {
    int insertContact(Contact contact);
}
