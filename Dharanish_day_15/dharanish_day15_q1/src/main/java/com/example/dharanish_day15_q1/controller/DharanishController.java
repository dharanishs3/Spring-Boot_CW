package com.example.dharanish_day15_q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.dharanish_day15_q1.model.DharanishModel;
import com.example.dharanish_day15_q1.service.DharanishService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class DharanishController {
    @Autowired
    public DharanishService personService;

    @GetMapping("/persons")
    public List<DharanishModel> getMethodName() {
        return personService.getData();
    }

    @PostMapping("/persons")
    public DharanishModel postMethodName(@RequestBody DharanishModel entity) {
        return personService.postDaata(entity);
    }
    
    
}
