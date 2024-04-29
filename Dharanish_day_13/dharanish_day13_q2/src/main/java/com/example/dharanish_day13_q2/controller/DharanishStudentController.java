package com.example.dharanish_day13_q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.dharanish_day13_q2.model.DharanishStudent;
import com.example.dharanish_day13_q2.service.DharanishStudentService;


@RestController
public class DharanishStudentController {

     @Autowired
    public DharanishStudentService studentService;

    @PostMapping("/department/{departmentId}/student")
    public DharanishStudent postMethodName(@RequestBody DharanishStudent entity) {
       return studentService.postData(entity);
    }
    @GetMapping("/department/student")
    public List<DharanishStudent> getMethodName(@RequestParam String param) {
        return studentService.getData();
    }
    @GetMapping("/department/student/{studentId}")
    public DharanishStudent getOneName(@PathVariable int param) {
        return studentService.getOneData(param);
    }
    
}
