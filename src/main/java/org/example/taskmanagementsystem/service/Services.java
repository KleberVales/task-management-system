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


}
