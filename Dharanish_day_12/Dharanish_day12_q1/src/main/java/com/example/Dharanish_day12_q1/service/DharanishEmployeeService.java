package com.example.Dharanish_day12_q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dharanish_day12_q1.model.DharanishEmployee;
import com.example.Dharanish_day12_q1.repository.DharanishEmployeeRepo;

@Service
public class DharanishEmployeeService {


    @Autowired
    public DharanishEmployeeRepo employeeRepo;

    public List<DharanishEmployee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public List<DharanishEmployee> ByInnerJoin() {
        return employeeRepo.getByInnerJoin();
    }
    public List<DharanishEmployee> ByLeftOuterJoin() {
        return employeeRepo.getByLeftOuterJoin();
    }

}
