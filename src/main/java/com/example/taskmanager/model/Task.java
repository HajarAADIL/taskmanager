package com.example.taskmanager.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Représente une tâche à réaliser")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Identifiant unique de la tâche", example = "1")
    private long id;
    @Schema(description = "Titre ou description courte de la tâche", example = "Faire les courses")
    private String title;
    @Schema(description = "Indique si la tâche est complétée", example = "false")
    private boolean completed;

}
