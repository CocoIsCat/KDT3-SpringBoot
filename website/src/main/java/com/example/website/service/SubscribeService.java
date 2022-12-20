package com.example.website.service;

import com.example.website.mapper.SubscribeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SubscribeService {

    @Autowired
    SubscribeMapper subscribeMapper;

    public void subscribe(String email) {
        if (!duplicate(email)) {
            subscribeMapper.insertSub(email);
        }
    }

    private boolean duplicate(String email) {
        List<Map<String, String>> subs = subscribeMapper.selectSub();
        boolean result = false;
        for(Map<String, String> m : subs) {
            if(m.get("email").equals(email)) {
                result = true;
            }
        }
        return result;
    }
}
