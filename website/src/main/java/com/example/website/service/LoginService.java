package com.example.website.service;

import com.example.website.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Service
public class LoginService {

    private final MemberMapper memberMapper;

    @Autowired
    public LoginService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public boolean login(Map<String, String> LoginInfo, HttpSession session) {
        String email = LoginInfo.get("email");
        String password = LoginInfo.get("password");
        Map<String, String> member = memberMapper.selectMember(email);
        int presentAmount;

        if (member.get("email").equals(email) && member.get("password").equals(password)) {
            session.setAttribute("email", email);
            return true;
        }
        else
            return false;
    }
}
