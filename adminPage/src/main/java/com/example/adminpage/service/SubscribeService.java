package com.example.adminpage.service;

import com.example.adminpage.dto.Subscribe;
import com.example.adminpage.repository.SubscribeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscribeService {

    @Autowired
    SubscribeRepository subscribeRepository;

    public List<Subscribe> selectSubscribe() {
        List<Subscribe> subscribes = subscribeRepository.selectSubscribe();
        for(Subscribe s : subscribes){
            System.out.println(s.toString());
        }
        return subscribeRepository.selectSubscribe();
    }
}
