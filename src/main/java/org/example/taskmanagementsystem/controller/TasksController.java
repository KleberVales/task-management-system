package org.example.taskmanagementsystem.controller;

import org.example.taskmanagementsystem.model.Tasks;
import org.example.taskmanagementsystem.service.Services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TasksController {

    private final Services services;

    public TasksController(Services services) {

        this.services = services;

    }


    @GetMapping
    public List<Tasks> getProducts() {
        return services.showAllProducts();
    }

    @PostMapping
    public Tasks createProduct(@RequestBody Tasks tasks) {
        return services.save(tasks);
    }


}
