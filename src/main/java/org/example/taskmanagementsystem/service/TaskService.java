package org.example.taskmanagementsystem.service;

import org.example.taskmanagementsystem.model.Task;
import org.example.taskmanagementsystem.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> listAll() {
        return repository.findAll();
    }

    public Task findById(Long id) {
        return repository.findById(id);
    }

    public void create(Task task) {
        repository.save(task);
    }

    public void update(Long id, Task task) {
        task.setId(id);
        repository.update(task);
    }

    public void delete(Long id) {
        repository.delete(id);
    }
}
