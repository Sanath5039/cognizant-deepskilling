package com.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Exercise 9: Entry point for the Spring Boot library management system.
 * Run this class (or `mvn spring-boot:run`) to start the embedded server
 * and test the REST endpoints under /api/books.
 */
@SpringBootApplication
public class LibraryManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementApplication.class, args);
    }
}
