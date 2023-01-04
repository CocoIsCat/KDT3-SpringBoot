package com.example.jpatest.dto;


import com.example.jpatest.entity.Schedule;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ScheduleResponse {
    private String id;
    private String title;
    private String date;

    public ScheduleResponse(Schedule schedule) {

        this.id = String.valueOf(schedule.getId());
        this.title = schedule.getTitle();
        this.date = schedule.getDate();

    }


}
