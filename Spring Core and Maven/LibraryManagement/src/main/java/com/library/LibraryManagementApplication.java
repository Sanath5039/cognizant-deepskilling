package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Loads the Spring IoC container from applicationContext.xml and exercises
 * BookService/BookRepository (Exercises 1, 2, 5) while LoggingAspect's
 * before/after/around advice (Exercises 3 & 8) fires in the console.
 */
public class LibraryManagementApplication {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean(BookService.class);

        bookService.addBook("Effective Java");
        bookService.addBook("Clean Code");

        List<String> books = bookService.listBooks();
        System.out.println("Books in library: " + books);
    }
}
