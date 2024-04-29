package com.example.dharanish_day13_q1.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dharanish_day13_q1.model.DharanishAuthor;
import com.example.dharanish_day13_q1.repository.DharanishAuthorRepo;


@Service
public class DharanishAuthorService {
    @Autowired
    public DharanishAuthorRepo authorRepo;

    public DharanishAuthor postData(DharanishAuthor author){
        return authorRepo.save(author);
    }

    public List<DharanishAuthor> getData(){
        return authorRepo.findAll();
    }
    public DharanishAuthor getOneData(int id){
        return authorRepo.findById(id).orElseThrow(()->new Error("Not FOund"));
    }

    public DharanishAuthor putData(int id,DharanishAuthor author){
        return authorRepo.save(author);
    }
}
