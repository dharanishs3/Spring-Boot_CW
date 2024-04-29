package com.example.dharanish_day12_q2.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dharanish_day12_q2.model.DharanishStudent;
import com.example.dharanish_day12_q2.repository.DharanishStudentRepo;


@Service
public class DharanishStudentService {
    @Autowired
    public DharanishStudentRepo employeeRepo;

    public List<DharanishStudent> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public List<DharanishStudent> ByInnerJoin() {
        return employeeRepo.getByInnerJoin();
    }
    public List<DharanishStudent> ByLeftOuterJoin() {
        return employeeRepo.getByLeftOuterJoin();
    }

}
