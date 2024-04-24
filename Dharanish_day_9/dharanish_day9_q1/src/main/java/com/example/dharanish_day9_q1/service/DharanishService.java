package com.example.dharanish_day9_q1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dharanish_day9_q1.model.DharanishModel;
import com.example.dharanish_day9_q1.repository.DharanishRepo;

@Service
public class DharanishService {
    public DharanishRepo personRepo;

    public DharanishService(DharanishRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(DharanishModel person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<DharanishModel> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
