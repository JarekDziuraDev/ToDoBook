package com.example.todobook.repository;

import com.example.todobook.model.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;


import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    List<Task> findAll();
    Page<Task> findAll(Pageable page);

    Optional<Task> findById(Integer id);

    Task save(Task task);

    boolean existsById(Integer id);

    List<Task> findByDone(@Param("state") boolean done);

    boolean existsByDoneIsFalseAndGroup_Id(Integer groupId);
}
