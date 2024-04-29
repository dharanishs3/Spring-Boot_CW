package com.example.dharanish_day12_q2.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.dharanish_day12_q2.model.DharanishStudentDetail;
import com.example.dharanish_day12_q2.service.DharanishStudentDetailService;


@RestController
public class DharanishStudentDetailController {
    @Autowired
    public DharanishStudentDetailService addressService;

    @PostMapping("/studentDetail/student/{id}")
    public List<DharanishStudentDetail> postMethodName(@PathVariable String entity) {
        return addressService.getData();
    }
}
