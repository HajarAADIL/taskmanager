package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> findAll();
}
