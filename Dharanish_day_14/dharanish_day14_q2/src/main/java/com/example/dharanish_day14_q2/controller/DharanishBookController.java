package com.example.dharanish_day14_q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.dharanish_day14_q2.model.DharanishBook;
import com.example.dharanish_day14_q2.service.DharanishBookService;



@RestController
@RequestMapping("/api")
public class DharanishBookController {

    @Autowired
    public DharanishBookService bookService;

    @PostMapping("/book")
    public DharanishBook postMethodName(@RequestBody DharanishBook entity) {
        return bookService.postBook(entity);
    }
    
    @GetMapping("/book")
    public List<DharanishBook> getMethodName() {
        return bookService.getBook();
    }
    
    @GetMapping("/book/{bookId}")
    public DharanishBook getOneMethodName(@PathVariable int param) {
        return bookService.getBookById(param);
    }

    @DeleteMapping("/book/{bookId}")
    public String deleteMethodName(@PathVariable int id){
        bookService.deleteBook(id);
        return "Deleted";
    }
    

}
