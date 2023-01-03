package com.example.todolistjpa.service;

import com.example.todolistjpa.dto.TodoResponse;

import java.util.List;

public interface TodoService {

    /**
     * 할 일 목록 불러오기
     * @return
     */
    List<TodoResponse> todoList();

    /**
     * 할 일 삭제
     * @param id
     * @return
     */
    String deleteTodos(String id);

    /**
     * 할 일 등록
     * @param todos
     * @return
     */
    String insertTodo(String todos);
}
