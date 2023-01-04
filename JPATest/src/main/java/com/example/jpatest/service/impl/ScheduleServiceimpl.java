package com.example.jpatest.service.impl;

import com.example.jpatest.dto.ScheduleRequest;
import com.example.jpatest.dto.ScheduleResponse;
import com.example.jpatest.entity.User;
import com.example.jpatest.repository.ScheduleRepository;
import com.example.jpatest.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ScheduleServiceimpl implements ScheduleService {

    private final ScheduleRepository scheduleRepository;

    @Override
    public List<ScheduleResponse> scheduleList(String email) {

        return scheduleRepository.findByUser(User.builder()
                .email(email)
                .build()).stream()
                        .map(schedule -> new ScheduleResponse(schedule))
                        .collect(Collectors.toList());
    }

    @Override
    public String deleteSchedules(String id) {

        try {
            scheduleRepository.deleteById(Long.valueOf(id));
        } catch (Exception e) {
            return "failed";
        }
        return "success";
    }

    @Override
    public String insertSchedules(ScheduleRequest scheduleRequest) {

        try {
            scheduleRepository.save(scheduleRequest.toEntity());
        } catch (Exception e) {
            return "failed";
        }
        return "success";
    }
}
