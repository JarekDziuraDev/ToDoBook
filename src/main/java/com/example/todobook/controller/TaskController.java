package com.example.todobook.controller;

import com.example.todobook.model.Task;
import com.example.todobook.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {

    private final TaskRepository taskRepository;

    @GetMapping(path="/tasks")
    public List<Task> getTasks() {
        //throw new IllegalArgumentException("Not impl. yet!");
        return taskRepository.findAll();
    }
}
