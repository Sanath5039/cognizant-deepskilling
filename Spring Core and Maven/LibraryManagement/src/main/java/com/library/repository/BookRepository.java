package com.library.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Exercise 1 / Exercise 6: BookRepository is the data-access class.
 * The @Repository annotation (Exercise 6) marks this as a Spring-managed
 * bean and makes it eligible for component scanning. It could equally be
 * declared as a plain <bean> in applicationContext.xml (Exercise 1 & 5) -
 * see the commented example at the bottom of applicationContext.xml.
 */
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
