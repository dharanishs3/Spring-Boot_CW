package com.example.dharanish_day14_q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.example.dharanish_day14_q1.model.DharanishEmployee;
import com.example.dharanish_day14_q1.repository.DharanishEmployeeRepo;


@Service
public class DharanishEmployeeService {

    @Autowired
    public DharanishEmployeeRepo employeeRepo;

    public List<DharanishEmployee> getData(){
        return employeeRepo.findAll();
    }

    public DharanishEmployee postData(DharanishEmployee e){
        return employeeRepo.save(e);
    }

    public DharanishEmployee getOneData(int id){
        return employeeRepo.findById(id).orElseThrow(()->new Error("Not found"));
    }

}
