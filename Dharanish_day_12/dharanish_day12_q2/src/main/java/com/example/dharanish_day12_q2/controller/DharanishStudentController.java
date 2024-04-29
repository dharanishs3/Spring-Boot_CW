package com.example.dharanish_day12_q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.dharanish_day12_q2.model.DharanishStudent;
import com.example.dharanish_day12_q2.service.DharanishStudentService;


@RestController
public class DharanishStudentController {
    @Autowired
    public DharanishStudentService employeeService;

    @PostMapping("/student")
    public List<DharanishStudent> postMethodName(@RequestBody String entity) {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/students-inner-join")
    public List<DharanishStudent> Get1MethodName(@RequestBody String entity) {
        return employeeService.ByInnerJoin();
    }
    @GetMapping("/students-left-outer-join")
    public List<DharanishStudent> Get2MethodName(@RequestBody String entity) {
        return employeeService.ByLeftOuterJoin();
    }
}
