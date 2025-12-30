package org.example.taskmanagementsystem.repository;

import org.example.taskmanagementsystem.model.Tasks;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskRepository {

    private JdbcTemplate jdbcTemplate;

    public TaskRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private RowMapper<Tasks> rowMapper = (rs, rowNum) -> {

        Tasks tasks = new Tasks();

        tasks.setId(rs.getLong("id"));
        tasks.setTopic(rs.getString("topic"));
        tasks.setTitle(rs.getString("title"));
        tasks.setDescription(rs.getString("description"));
        return tasks;


    };


    public List<Tasks> findAll() {

        return jdbcTemplate.query("select * from tasks", rowMapper);
    }

    public int save(Tasks task) {
        String sql = """
                        INSERT INTO tasks (topic, title, description) 
                        VALUES (?, ?, ?)
                        """;

        return jdbcTemplate.update(
                sql,
                task.getTopic(),
                task.getTitle(),
                task.getDescription()
        );


}
}
