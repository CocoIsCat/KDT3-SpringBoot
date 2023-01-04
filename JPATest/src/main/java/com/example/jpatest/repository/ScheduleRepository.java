package com.example.jpatest.repository;

import com.example.jpatest.entity.Schedule;
import com.example.jpatest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    List<Schedule> findByUser(User user);

}
