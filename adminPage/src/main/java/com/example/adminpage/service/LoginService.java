package com.example.adminpage.service;

import com.example.adminpage.dto.Admin;
import com.example.adminpage.repository.AdminRepository;
import com.example.adminpage.repository.MysqlAdminReposotiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class LoginService {

    private final MysqlAdminReposotiry mysqlAdminReposotiry;
    @Autowired
    public LoginService(MysqlAdminReposotiry mysqlAdminReposotiry) {
        this.mysqlAdminReposotiry = mysqlAdminReposotiry;
    }


    public boolean LogIn(Admin admin, HttpSession session) {
        Admin admin1 = mysqlAdminReposotiry.selectAdmin(admin);
        if (admin1.getId().equals(admin.getId()) && admin1.getPassword().equals(admin.getPassword())) {
            session.setAttribute("email", admin1.getId());
            return true;
        }
        else{
            return false;
        }
    }
}
