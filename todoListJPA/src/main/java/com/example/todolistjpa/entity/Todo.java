package com.example.todolistjpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="todo")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Todo {

    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name="todos")
    private String todos;

    @Column(name="indate")
    private String Indate;
}