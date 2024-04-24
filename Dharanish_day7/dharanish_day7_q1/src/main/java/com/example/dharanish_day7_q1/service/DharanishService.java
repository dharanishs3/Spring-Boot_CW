package com.example.dharanish_day7_q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.dharanish_day7_q1.model.DharanishModel;
import com.example.dharanish_day7_q1.repository.DharanishRepo;

@Service
public class DharanishService {

     @Autowired
     public DharanishRepo personRepo;

     public DharanishModel SaveEntity(DharanishModel entity) {
          return personRepo.save(entity);

     }

     public List<DharanishModel> getDetails() {
          return personRepo.findAll();

     }

     public List<DharanishModel> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
