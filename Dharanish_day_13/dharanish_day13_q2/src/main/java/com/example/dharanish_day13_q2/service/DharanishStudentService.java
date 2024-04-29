package com.example.dharanish_day13_q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dharanish_day13_q2.model.DharanishStudent;
import com.example.dharanish_day13_q2.repository.DharanishStudentRepo;


@Service
public class DharanishStudentService {
    @Autowired
    public DharanishStudentRepo studentRepo;

    public List<DharanishStudent> getData(){
        return studentRepo.findAll();
    }
    
    public DharanishStudent getOneData(int id){
        return studentRepo.findById(id).orElseThrow(()->new Error("Not found"));
    }

    public DharanishStudent postData(DharanishStudent dep){
        return studentRepo.save(dep);
    }
}
