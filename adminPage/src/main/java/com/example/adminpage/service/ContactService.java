package com.example.adminpage.service;

import com.example.adminpage.dto.Contact;
import com.example.adminpage.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public List<Contact> selectContact() {
        return contactRepository.selectContact();
    }
}
