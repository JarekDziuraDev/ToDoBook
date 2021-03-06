package com.example.todobook.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Task description must be not empty.")
    private String description;
    private boolean done;

    @Embedded
    private Audit audit = new Audit();

    private LocalDateTime deadline;

    @ManyToOne
    @JoinColumn(name = "task_groups_id")
    private TaskGroup group;

    public Task(String description, LocalDateTime deadline) {
        this.deadline = deadline;
        this.description = description;
    }


    public void updateFrom(final Task source) {
        this.description = source.description;
        this.done = source.done;
        this.deadline = source.deadline;
        this.group = source.group;
    }
}
