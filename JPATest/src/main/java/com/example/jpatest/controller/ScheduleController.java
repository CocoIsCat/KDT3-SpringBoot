package com.example.jpatest.controller;

import com.example.jpatest.dto.ScheduleRequest;
import com.example.jpatest.dto.ScheduleResponse;
import com.example.jpatest.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class ScheduleController {

    private final ScheduleService scheduleService;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/schedules")
    public List<ScheduleResponse> scheduleList(HttpSession session) {
        String email = String.valueOf(session.getAttribute("email"));
        return scheduleService.scheduleList(email);
    }

    @DeleteMapping("/schedules/{id}")
    public String deleteSchedules(@PathVariable("id") String id) {
        return scheduleService.deleteSchedules(id);
    }

    @PostMapping("/schedules")
    public String insertSchedules(ScheduleRequest scheduleRequest, HttpSession session) {
        String email = String.valueOf(session.getAttribute("email"));
        scheduleRequest.setEmail(email);
        return scheduleService.insertSchedules(scheduleRequest);
    }
}
