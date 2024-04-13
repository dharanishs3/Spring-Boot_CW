package com.example.q4.controller;

import com.example.q4.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class BookController {

    @GetMapping("/book")
    public Book getBookDetails() {
        Book book = new Book("The Great Soldier", "G. Gyan", new Date());
        return book;
    }
}
