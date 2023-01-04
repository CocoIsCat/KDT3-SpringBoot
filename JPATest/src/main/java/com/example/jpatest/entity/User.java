package com.example.jpatest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Entity
@Table(name="schedule_user")
public class User {

    @Id
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;

    @OneToMany(fetch = FetchType.LAZY)
    @OrderBy("date DESC")
    private List<Schedule> schedules;
}
