package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.service.TaskService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
@Tag(name = "Tâches", description = "Opérations CRUD sur les tâches")
public class TaskController {

    private final TaskService taskService;

    @GetMapping
    @Operation(summary = "Lister les tâches", description = "Retourne toutes les tâches enregistrées dans la base")
    public List<Task> getTasks() {
        return taskService.findAll();
    }

    @PostMapping
    @Operation(summary = "Créer une tâche", description = "Ajoute une nouvelle tâche à la base de données")
    public Task createTask(@RequestBody Task task) {
        return taskService.save(task);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Mettre à jour une tâche", description = "Met à jour une tâche existante selon son ID")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskService.update(id, task);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Mettre à jour une tâche", description = "Met à jour une tâche existante selon son ID")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        return taskService.delete(id);
    }
}
