package com.example.dharanish_day8_q3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dharanish_day8_q3.model.DharanishModel;
import com.example.dharanish_day8_q3.repository.DharanishRepo;

@Service
public class DharanishService {
    @Autowired
    private DharanishRepo studentRepo;

    public boolean post(DharanishModel student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<DharanishModel> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<DharanishModel> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
