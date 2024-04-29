package com.example.dharanish_day15_q3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dharanish_day15_q3.model.DharanishModel;
import com.example.dharanish_day15_q3.repository.DharanishRepo;


@Service
public class DharanishService{
    @Autowired
    public DharanishRepo productRepo;

    public DharanishModel postData(DharanishModel p){
        return productRepo.save(p);
    }

    public DharanishModel getOneData(int id){
        return productRepo.findById(id).orElseThrow();
    }

    public List<DharanishModel> getData(){
        return productRepo.findAll();
    }

    public void deleteData(int id){
        productRepo.deleteById(id);
    }

    public DharanishModel putData(int id,DharanishModel p){
        DharanishModel pr=productRepo.findById(id).orElseThrow();
        pr.setName(p.getName());
        pr.setPrice(p.getPrice());
        return productRepo.save(pr);
    }
}
