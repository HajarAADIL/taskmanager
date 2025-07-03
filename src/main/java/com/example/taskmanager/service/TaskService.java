package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TaskService {
    List<Task> findAll();
    Task save(Task task);
    ResponseEntity<Task> update(Long id, Task task);
    ResponseEntity<Void> delete(Long id);
}
