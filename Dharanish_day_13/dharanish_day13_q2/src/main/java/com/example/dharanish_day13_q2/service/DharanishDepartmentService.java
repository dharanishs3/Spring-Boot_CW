package com.example.dharanish_day13_q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dharanish_day13_q2.model.DharanishDepartment;
import com.example.dharanish_day13_q2.repository.DharanishDepartmentRepo;


@Service
public class DharanishDepartmentService {
    @Autowired
    public DharanishDepartmentRepo departmentRepo;

    public List<DharanishDepartment> getData(){
        return departmentRepo.findAll();
    }
    
    public DharanishDepartment getOneData(int id){
        return departmentRepo.findById(id).orElseThrow(()->new Error("Not found"));
    }

    public DharanishDepartment postData(DharanishDepartment dep){
        return departmentRepo.save(dep);
    }
}
