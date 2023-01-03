package com.example.todolistjpa.controller;

import com.example.todolistjpa.dto.TodoResponse;
import com.example.todolistjpa.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TodoController {

    private final TodoService todoService;

    @GetMapping("/todos")
    private List<TodoResponse> todoLists() {
        return todoService.todoList();
    }

    @DeleteMapping("/todos/{id}")
    public String deleteTodos(@PathVariable("id") String id) {
        return todoService.deleteTodos(id);
    }

    @PostMapping("/todos")
    public String insertTodos(String todos) {
        return todoService.insertTodo(todos);
    }
}