package com.example.dharanish_day14_q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.dharanish_day14_q1.model.DharanishEmployee;
import com.example.dharanish_day14_q1.service.DharanishEmployeeService;

import org.springframework.web.bind.annotation.*;


@RestController
public class DharanishEmployeeController {

    @Autowired
    public DharanishEmployeeService employeeService;

    @PostMapping("/employee")
    public DharanishEmployee postMethodName(@RequestBody DharanishEmployee entity) {
        return employeeService.postData(entity);
    }

    @GetMapping("/employee")
    public List<DharanishEmployee> getMethodName() {
        return employeeService.getData();
    }
    
    @GetMapping("/employee/{employeeId}")
    public DharanishEmployee findEmployee(@PathVariable int id){
        return employeeService.getOneData(id);
    }

}
