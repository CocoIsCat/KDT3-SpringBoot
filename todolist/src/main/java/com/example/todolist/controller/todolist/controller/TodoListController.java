package com.example.todolist.controller.todolist.controller;


import com.example.todolist.mapper.TodoListMapper;
import com.example.todolist.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;


@RestController
public class TodoListController {

    @Autowired
    TodoListService ts;

    @GetMapping("/list")
    public ArrayList<HashMap<String,Object>> list() {
        return ts.selectTodo();
    }

    @GetMapping("/receiveList")
    public ArrayList<HashMap<String,Object>> reveiveList(String todo) {
        ts.insertTodo(todo);
        return ts.selectTodo();
    }

    @GetMapping("/deleteList")
    public ArrayList<HashMap<String,Object>> deleteList(int todo) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("id", todo);
        ts.deleteTodo(params);
        return ts.selectTodo();
    }
}
