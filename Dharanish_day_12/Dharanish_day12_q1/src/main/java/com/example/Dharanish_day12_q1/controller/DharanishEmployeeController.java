package com.example.Dharanish_day12_q1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.Dharanish_day12_q1.model.DharanishEmployee;
import com.example.Dharanish_day12_q1.service.DharanishEmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class DharanishEmployeeController {
    
    @Autowired
    public DharanishEmployeeService employeeService;

    @PostMapping("/employee")
    public List<DharanishEmployee> postMethodName(@RequestBody String entity) {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/employee-inner-join")
    public List<DharanishEmployee> Get1MethodName(@RequestBody String entity) {
        return employeeService.ByInnerJoin();
    }
    @GetMapping("/employee-left-outer-join")
    public List<DharanishEmployee> Get2MethodName(@RequestBody String entity) {
        return employeeService.ByLeftOuterJoin();
    }
    

}
