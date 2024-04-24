package com.example.dharanish_day7_q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.dharanish_day7_q2.model.DharanishModel;
import com.example.dharanish_day7_q2.repository.DharanishRepo;

@Service
public class DharanishService {

     @Autowired
     public DharanishRepo courseRepo;

     public DharanishModel SaveEntity(DharanishModel entity) {
          return courseRepo.save(entity);

     }

     public List<DharanishModel> getDetails() {
          return courseRepo.findAll();

     }

     public List<DharanishModel> findByCourseName(String courseName) {
          return courseRepo.findByCourseName(courseName);
     }

}
