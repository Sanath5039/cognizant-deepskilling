package com.library.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 
@Repository
public class BookRepository {

    private final List<String> books = new ArrayList<>();

    public void addBook(String title) {
        books.add(title);
    }

    public List<String> findAll() {
        return Collections.unmodifiableList(books);
    }
}
