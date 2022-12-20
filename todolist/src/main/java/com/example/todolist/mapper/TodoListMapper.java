package com.example.todolist.mapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface TodoListMapper {
    int insertTodo(String todo);

    ArrayList<HashMap<String, Object>> selectTodo();

    int deleteTodo(HashMap<String,Object> params);

}
