package com.example.dharanish_day8_q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.dharanish_day8_q2.model.DharanishModel;
import com.example.dharanish_day8_q2.repository.DharanishRepo;

@Service
public class DharanishService {
    @Autowired
    private DharanishRepo rep;

    @SuppressWarnings("null")
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
        return rep.findByProductNameStartingWith(value);
    }

    public List<DharanishModel> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<DharanishModel> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}
