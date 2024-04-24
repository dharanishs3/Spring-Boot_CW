package com.example.dharanish_day6_q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.dharanish_day6_q2.model.DharanishModel;
import com.example.dharanish_day6_q2.repository.DharanishRepo;

@Service
public class DharanishService {

     @Autowired
     public DharanishRepo studentRepo;

     public List<DharanishModel> getAll() {
          return studentRepo.findAll();
     }

     public DharanishModel post(DharanishModel student) {
          return studentRepo.save(student);
     }

     public List<DharanishModel> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
