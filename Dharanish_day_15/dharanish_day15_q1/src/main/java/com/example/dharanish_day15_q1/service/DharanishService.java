package com.example.dharanish_day15_q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dharanish_day15_q1.model.DharanishModel;
import com.example.dharanish_day15_q1.repository.DharanishRepo;

@Service
public class DharanishService {
    @Autowired
    public DharanishRepo personRepo;
    public List<DharanishModel> getData(){
        return personRepo.findAll();
    }
    public DharanishModel postDaata(DharanishModel p){
        return personRepo.save(p);
    }
}
