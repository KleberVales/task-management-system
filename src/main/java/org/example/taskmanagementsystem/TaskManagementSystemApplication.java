package org.example.taskmanagementsystem;

import org.example.taskmanagementsystem.service.Services;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskManagementSystemApplication implements CommandLineRunner {

    private final Services productService;

    public TaskManagementSystemApplication(Services productService) {
        this.productService = productService;
    }

    public static void main(String[] args) {
        SpringApplication.run(TaskManagementSystemApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("📦 Lista inicial de produtos:");
        productService.showAllProducts();

    }
}
