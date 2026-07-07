package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Exercise 2: BookService depends on BookRepository (Spring IoC/DI).
 * Exercise 6: @Service marks this class as a Spring-managed bean.
 * Exercise 7: Both a constructor (constructor injection) and a setter
 * (setter injection) are provided for BookRepository, so this class can be
 * wired either way from applicationContext.xml or via @Autowired.
 */
@Service
public class BookService {

    private BookRepository bookRepository;

    // Exercise 7: Constructor injection
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Required by Exercise 2 / Exercise 5 / Exercise 7: setter for BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title) {
        bookRepository.addBook(title);
    }

    public List<String> listBooks() {
        return bookRepository.findAll();
    }
}
