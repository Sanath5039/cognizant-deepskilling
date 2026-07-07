package com.library.repository;

import com.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Exercise 9: Spring Data JPA repository for Book. Extending JpaRepository
 * gives us CRUD operations (save, findAll, findById, deleteById, etc.)
 * without writing any implementation code.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
