package com.example.todolistjpa.repository;

import com.example.todolistjpa.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepoisitory extends JpaRepository<Todo, Long> {
}
