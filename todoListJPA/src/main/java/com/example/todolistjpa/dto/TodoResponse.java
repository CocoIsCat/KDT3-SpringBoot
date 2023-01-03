package com.example.todolistjpa.dto;

import com.example.todolistjpa.entity.Todo;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TodoResponse {

    private String id;
    private String todos;

    public TodoResponse(Todo todo) {
        this.id = Long.toString(todo.getId());
        this.todos = todo.getTodos();
    }
}