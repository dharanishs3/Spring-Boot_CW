package com.example.dharanish_day14_q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dharanish_day14_q2.model.DharanishBook;
import com.example.dharanish_day14_q2.repository.DharanishBookRepo;

@Service
public class DharanishBookService {

    @Autowired
    public DharanishBookRepo bookRepo;

    public DharanishBook postBook(DharanishBook b){
        return bookRepo.save(b);
    }

    public List<DharanishBook> getBook(){
        return bookRepo.findAll();
    }

    public DharanishBook  getBookById(int id) {
    	return bookRepo.findById(id).orElseThrow();
    }

    public void deleteBook(int id){
        bookRepo.deleteById(id);
    }

}
