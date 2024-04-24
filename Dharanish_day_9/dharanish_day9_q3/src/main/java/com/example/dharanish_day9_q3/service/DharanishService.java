package com.example.dharanish_day9_q3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dharanish_day9_q3.model.DharanishModel;
import com.example.dharanish_day9_q3.repository.DharanishRepo;

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

    public DharanishModel start(String lastname)
    {
        return rep.findByName(lastname);
    }
    public DharanishModel get3(int id)
    {
        return rep.findById(id);
    }

    public List<DharanishModel> end(int population)
    {
        return rep.findByPopulation(population);
    }
    
}
