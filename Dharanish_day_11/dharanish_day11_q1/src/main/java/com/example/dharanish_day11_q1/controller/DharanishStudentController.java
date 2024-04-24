package com.example.dharanish_day11_q1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.dharanish_day11_q1.model.DharanishStudent;
import com.example.dharanish_day11_q1.model.DharanishStudentInfo;
import com.example.dharanish_day11_q1.service.DharanishService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class DharanishStudentController {
    public DharanishService studentService;
    public DharanishStudentController(DharanishService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public DharanishStudent postMethodName(@RequestBody DharanishStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public DharanishStudentInfo postMethodName(@RequestBody DharanishStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<DharanishStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}