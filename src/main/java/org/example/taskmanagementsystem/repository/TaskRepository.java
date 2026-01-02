package org.example.taskmanagementsystem.repository;

import org.example.taskmanagementsystem.model.Task;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskRepository {

    private final JdbcTemplate jdbcTemplate;

    public TaskRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Task> findAll() {
        return jdbcTemplate.query(
                "SELECT * FROM tasks ORDER BY created_at DESC",
                new BeanPropertyRowMapper<>(Task.class)
        );
    }

    public Task findById(Long id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM tasks WHERE id = ?",
                new BeanPropertyRowMapper<>(Task.class),
                id
        );
    }

    public void save(Task task) {
        jdbcTemplate.update(
                "INSERT INTO tasks (title, description, completed) VALUES (?, ?, ?)",
                task.getTitle(),
                task.getDescription(),
                task.isCompleted()
        );
    }

    public void update(Task task) {
        jdbcTemplate.update(
                "UPDATE tasks SET title = ?, description = ?, completed = ? WHERE id = ?",
                task.getTitle(),
                task.getDescription(),
                task.isCompleted(),
                task.getId()
        );
    }

    public void delete(Long id) {
        jdbcTemplate.update("DELETE FROM tasks WHERE id = ?", id);
    }
}

