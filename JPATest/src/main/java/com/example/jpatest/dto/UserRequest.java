package com.example.jpatest.dto;

import com.example.jpatest.entity.User;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserRequest {

    private String email;
    private String password;

    public User toEntity() {
        return User.builder()
                .email(this.email)
                .password(this.password)
                .build();
    }
}
