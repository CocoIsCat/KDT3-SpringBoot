package com.example.jpatest.service;

import com.example.jpatest.dto.ScheduleRequest;
import com.example.jpatest.dto.ScheduleResponse;
import com.example.jpatest.entity.Schedule;

import java.util.List;

public interface ScheduleService {

    /**
     * 스케쥴 목록
     * @return
     */
    List<ScheduleResponse> scheduleList(String email);

    /**
     * 스케쥴 삭제
     * @param email
     * @return
     */
    String deleteSchedules(String email);


    /**
     * 스케쥴 등록
     * @param scheduleRequest
     * @return
     */
    String insertSchedules(ScheduleRequest scheduleRequest);
}
