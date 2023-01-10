package com.example.jpatest.controller;

import com.example.jpatest.service.ScheduleService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ScheduleControllerTest {

    @Mock
    private ScheduleService scheduleService;
    @InjectMocks
    private ScheduleController scheduleController;
}