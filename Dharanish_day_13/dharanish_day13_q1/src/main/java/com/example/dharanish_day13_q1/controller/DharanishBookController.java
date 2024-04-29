package com.example.dharanish_day13_q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.dharanish_day13_q1.model.DharanishBook;
import com.example.dharanish_day13_q1.service.DharanishBookService;



@RestController
public class DharanishBookController {
     @Autowired
    public DharanishBookService bookService;

    @PostMapping("/book/author/{authorId}")
    public DharanishBook postData(@PathVariable int entity,@RequestBody DharanishBook book) {
        return bookService.postData(book);
    }
   
    @DeleteMapping("/book/{bookd}")
    public String deleteDatta(@PathVariable int bookId){
        bookService.deleteData(bookId);
        return "Deleted";
    }
    
}
