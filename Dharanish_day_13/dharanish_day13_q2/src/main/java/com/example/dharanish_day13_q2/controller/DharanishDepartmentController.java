package com.example.dharanish_day13_q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dharanish_day13_q2.model.DharanishDepartment;
import com.example.dharanish_day13_q2.service.DharanishDepartmentService;



@RestController
public class DharanishDepartmentController {

    @Autowired
    public DharanishDepartmentService departmentService;

    @PostMapping("/department")
    public DharanishDepartment postMethodName(@RequestBody DharanishDepartment entity) {
       return departmentService.postData(entity);
    }
    @GetMapping("/department")
    public List<DharanishDepartment> getMethodName(@RequestParam String param) {
        return departmentService.getData();
    }
    @GetMapping("/department/{departmentId}/student")
    public DharanishDepartment getOneName(@PathVariable int param) {
        return departmentService.getOneData(param);
    }
    
    
}
