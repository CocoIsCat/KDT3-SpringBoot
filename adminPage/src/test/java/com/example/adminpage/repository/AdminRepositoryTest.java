package com.example.adminpage.repository;

import com.example.adminpage.dto.Admin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AdminRepositoryTest {

    @Autowired
    private MysqlAdminReposotiry mysqlAdminReposotiry;

    @Test
    void select() {
        Admin admin = new Admin("admin@admin.com", "1234");
        Admin admin1 = mysqlAdminReposotiry.selectAdmin(admin);
        /*System.out.println(admin1.getId());
        System.out.printf(admin1.getPassword());*/
        //org.assertj.core.api.Assertions.assertThat(admin).isEqualTo(stringStringMap);

    }
}