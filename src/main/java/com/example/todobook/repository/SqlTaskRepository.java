package com.example.todobook.repository;

import com.example.todobook.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@Repository
public interface SqlTaskRepository extends TaskRepository, JpaRepository<Task, Integer> {

    @Override
    boolean existsByDoneIsFalseAndGroup_Id(Integer groupId);
}
