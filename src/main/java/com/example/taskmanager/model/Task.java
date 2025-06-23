package com.example.taskmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task {

    @Id
    private long id;
    private String title;
    private boolean completed;

}
