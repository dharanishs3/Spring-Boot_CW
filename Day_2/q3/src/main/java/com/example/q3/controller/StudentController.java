package com.example.q3.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.q3.model.Student;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getMethodName() {
        Student s=new Student();
        s.setId(1L);
        s.setName("John Doe");
        s.setDescription("This is a student description.");
        return s;
    }
    
}
