package com.example.dharanish_day11_q2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.dharanish_day11_q2.model.DharanishStudent;
import com.example.dharanish_day11_q2.service.DharanishService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class DharanishController {
    public DharanishService studentService;
    public DharanishController(DharanishService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public DharanishStudent postMethodName(@RequestBody DharanishStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<DharanishStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
