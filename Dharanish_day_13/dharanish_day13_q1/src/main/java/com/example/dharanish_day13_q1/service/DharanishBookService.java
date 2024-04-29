package com.example.dharanish_day13_q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dharanish_day13_q1.model.DharanishBook;
import com.example.dharanish_day13_q1.repository.DharanishBookRepo;

@Service
public class DharanishBookService {
    @Autowired
    public DharanishBookRepo bookRepo;

    public DharanishBook postData(DharanishBook book){
        return bookRepo.save(book);
    }

    public String deleteData(int id){
        bookRepo.deleteById(id);
        return "Deleted";
    }
}
