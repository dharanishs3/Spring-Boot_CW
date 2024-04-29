package com.example.dharanish_day15_q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dharanish_day15_q2.model.DharanishModel;
import com.example.dharanish_day15_q2.repository.DharanishRepo;


@Service
public class DharanishService {
    @Autowired
    public DharanishRepo playerRepo;

    public DharanishModel postData(DharanishModel p){
        return playerRepo.save(p);
    }

    public DharanishModel getOneData(int id){
        return playerRepo.findById(id).orElseThrow();
    }

    public List<DharanishModel> getData(){
        return playerRepo.findAll();
    }
}
