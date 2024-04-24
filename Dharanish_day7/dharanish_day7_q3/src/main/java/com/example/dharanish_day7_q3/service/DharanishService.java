package com.example.dharanish_day7_q3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dharanish_day7_q3.model.DharanishModel;
import com.example.dharanish_day7_q3.repository.DharanishRepo;

@Service
public class DharanishService {
    @Autowired
    private DharanishRepo rep;

    public boolean post(DharanishModel door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<DharanishModel> getAll()
    {
        return rep.findAll();
    }

    public List<DharanishModel> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<DharanishModel> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
