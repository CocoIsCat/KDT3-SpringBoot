package com.example.adminpage.repository;

import com.example.adminpage.dto.Subscribe;
import com.example.adminpage.mapper.SubscribeMaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubscribeRepository {
    @Autowired
    SubscribeMaper subscribeMaper;
    public List<Subscribe> selectSubscribe() {
        return subscribeMaper.selectSubscribe();
    }
}
