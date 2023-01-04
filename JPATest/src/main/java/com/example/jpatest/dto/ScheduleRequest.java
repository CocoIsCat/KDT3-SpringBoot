package com.example.jpatest.dto;

import com.example.jpatest.entity.Schedule;
import com.example.jpatest.entity.User;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ScheduleRequest {

    private String email;
    private String title;
    private String date;

    public Schedule toEntity() {

        return Schedule.builder()
                .user(User.builder().email(this.email).build())
                .title(this.title)
                .date(this.date)
                .build();
    }
}
