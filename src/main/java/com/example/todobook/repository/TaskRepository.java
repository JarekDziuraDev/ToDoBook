package com.example.todobook.repository;

import com.example.todobook.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
