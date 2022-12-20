package com.example.website.service;

import com.example.website.dto.Contact;
import com.example.website.mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    ContactMapper contactMapper;
    public void insertContact(Contact contact) {
        if(contactMapper.insertContact(contact) == 1)
            System.out.println("성공");
    }
}
