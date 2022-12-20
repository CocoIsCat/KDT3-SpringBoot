package com.example.adminpage.repository;

import com.example.adminpage.dto.Admin;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface AdminRepository {

    Admin selectAdmin(Admin admin);
}
