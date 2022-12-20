package com.example.website.controller;

import com.example.website.dto.Contact;
import com.example.website.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @Autowired
    ContactService contactService;

    @PostMapping("/requestCall")
    public String requestCall(Contact contact) {
        contactService.insertContact(contact);
        System.out.println(contact.toString());
        return "redirect:/";
    }
}
