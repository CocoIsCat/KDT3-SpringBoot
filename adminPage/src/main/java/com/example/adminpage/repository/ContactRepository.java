package com.example.adminpage.repository;

import com.example.adminpage.dto.Contact;
import com.example.adminpage.mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactRepository {
    @Autowired
    ContactMapper contactMapper;
    public int cntContact() {
        return contactMapper.cntContact();
    }

    public List<Contact> selectContact() {
        return contactMapper.selectContact();
    }
}
