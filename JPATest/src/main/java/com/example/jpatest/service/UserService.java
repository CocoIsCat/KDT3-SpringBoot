package com.example.jpatest.service;

import com.example.jpatest.dto.UserRequest;

public interface UserService {

    /**
     * 유저 등록
     * @param userRequest
     * @return
     */
    String insertUser(UserRequest userRequest);

    /**
     * 유저 로그인
     * @param userRequest
     * @return
     */
    String selectUser(UserRequest userRequest);
}
