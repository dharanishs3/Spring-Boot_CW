package com.example.dharanish_day13_q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.dharanish_day13_q1.model.DharanishAuthor;
import com.example.dharanish_day13_q1.service.DharanishAuthorService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class DharanishAuthorController {
    @Autowired
    public DharanishAuthorService authorService;

    @PostMapping("/author")
    public DharanishAuthor postData(@RequestBody DharanishAuthor entity) {
        return authorService.postData(entity);
    }
    @GetMapping("/author/{authorId}")
    public DharanishAuthor getSingleData(@PathVariable int param) {
        return authorService.getOneData(param);
    }
    @GetMapping("/author")
    public List<DharanishAuthor> getData() {
        return authorService.getData();
    }

    @PutMapping("author/{authorId}")
    public DharanishAuthor putMethodName(@PathVariable int id, @RequestBody DharanishAuthor entity) {
        return authorService.putData(id, entity);
    }
    
}
