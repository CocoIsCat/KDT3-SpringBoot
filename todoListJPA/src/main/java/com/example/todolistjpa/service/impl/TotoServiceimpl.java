package com.example.todolistjpa.service.impl;

import com.example.todolistjpa.dto.TodoResponse;
import com.example.todolistjpa.entity.Todo;
import com.example.todolistjpa.repository.TodoRepoisitory;
import com.example.todolistjpa.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class TotoServiceimpl implements TodoService {

    private final TodoRepoisitory repo;

    @Override
    public List<TodoResponse> todoList() {
        return repo.findAll().stream()
                .map(en -> new TodoResponse(en))
                .collect(Collectors.toList());
    }

    @Override
    public String deleteTodos(String id) {
        try {
            repo.deleteById(Long.valueOf(id));
        } catch (Exception e) {
            //e.printStackTrace();
            return "failed";
        }
        return "success";
    }

    @Override
    public String insertTodo(String todos) {

        try {
            repo.save(Todo.builder()
                    .todos(todos)
                    .build());
        } catch (Exception e) {
            //e.printStackTrace();
            return "failed";
        }
        return "success";
    }
}