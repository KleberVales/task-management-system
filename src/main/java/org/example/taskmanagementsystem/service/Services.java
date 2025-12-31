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


    // Operação de inserção no banco de dados
    public Tasks save(Tasks task) {

        // regras de negócio / validações
        if (task.getTopic() == null || task.getTopic().isBlank()) {
            throw new IllegalArgumentException("Topic é obrigatório");
        }

        if (task.getTitle() == null || task.getTitle().isBlank()) {
            throw new IllegalArgumentException("Title é obrigatório");
        }

        repository.save(task);

        return task;
    }

    // Operação de leitura no banco de dados
    public List<Tasks> showAllProducts() {

        List<Tasks> products = repository.findAll();
        products.forEach(System.out::println);

        return repository.findAll();

    }

    public void update(Tasks task) {
        // validações básicas
        if (task.getId() == null) {
            throw new IllegalArgumentException("Id é obrigatório para atualização");
        }

        if (task.getTopic() == null || task.getTopic().isBlank()) {
            throw new IllegalArgumentException("Topic é obrigatório");
        }

        if (task.getTitle() == null || task.getTitle().isBlank()) {
            throw new IllegalArgumentException("Title é obrigatório");
        }

        int rows = repository.update(task);

        if (rows == 0) {
            throw new IllegalStateException("Task não encontrada para atualização");
        }
    }

    public void delete(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Id é obrigatório para exclusão");
        }

        int rows = repository.deleteById(id);

        if (rows == 0) {
            throw new IllegalStateException("Task não encontrada para exclusão");
        }
    }


}
