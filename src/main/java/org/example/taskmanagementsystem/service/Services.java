package org.example.taskmanagementsystem.service;

import org.example.taskmanagementsystem.model.Tasks;
import org.example.taskmanagementsystem.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services {


    private TaskRepository repository;

    public Services(TaskRepository repository) {
        this.repository = repository;
    }

    public void showAllProducts(){

        List<Tasks> products = repository.findAll();
        products.forEach(System.out::println);

    }

    public void save(Tasks task) {

        // regras de negócio / validações
        if (task.getTopic() == null || task.getTopic().isBlank()) {
            throw new IllegalArgumentException("Topic é obrigatório");
        }

        if (task.getTitle() == null || task.getTitle().isBlank()) {
            throw new IllegalArgumentException("Title é obrigatório");
        }

        repository.save(task);
    }


}
