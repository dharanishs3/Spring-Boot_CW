package com.example.dharanish_day8_q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dharanish_day8_q1.model.DharanishModel;
import com.example.dharanish_day8_q1.repository.DharanishRepo;

@Service
public class DharanishService {
    @Autowired
    private DharanishRepo rep;

    public boolean post(DharanishModel person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<DharanishModel> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<DharanishModel> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
