package com.example.adminpage.repository;

import com.example.adminpage.dto.Admin;
import com.example.adminpage.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
public class MysqlAdminReposotiry implements AdminRepository {

    private final AdminMapper adminMapper;

    @Autowired
    public MysqlAdminReposotiry(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    @Override
    public Admin selectAdmin(Admin admin) {
        return adminMapper.selectAdmin(admin);
    }
}
