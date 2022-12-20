package com.example.adminpage.controller;

import com.example.adminpage.dto.Contact;
import com.example.adminpage.service.ContactService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = {"문의 목록 리스트"}, description = "문의 목록 관련 서비스")
@RestController
public class ContactListController {

    @Autowired
    ContactService contactService;

    @ApiOperation(value = "문의 목록 조회", notes = "총 문의 목록 리스트를 조회한다")
    @GetMapping("/selectContact")
    public List<Contact> selectContact() {
        return contactService.selectContact();
    }
}
