package com.example.q2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.q2.model.Student;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class StudentController {
    @GetMapping("/students")
    public String getMethodName() {
        Student s=new Student();
        s.setName("Nithish");
        s.setAge(22);
        return "Student Created: "+s.getName()+",Age:"+s.getAge();
    }
    
}
