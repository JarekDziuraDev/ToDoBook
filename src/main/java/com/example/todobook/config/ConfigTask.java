package com.example.todobook.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
@ConfigurationProperties("task")
public class ConfigTask {
    private boolean allowMultipleTasksFromTemplate;
}
