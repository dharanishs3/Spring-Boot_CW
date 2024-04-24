package com.example.dharanish_day10_q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dharanish_day10_q1.model.DharanishModel;
import com.example.dharanish_day10_q1.repository.DharanishModelRepo;

@Service
public class DharanishModelService {
    @Autowired
    private DharanishModelRepo doorRepo;

    public DharanishModel postData(DharanishModel door) {
        return doorRepo.save(door);
    }

    public List<DharanishModel> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public DharanishModel updateDetail(int doorid, DharanishModel door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<DharanishModel> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<DharanishModel> getAllDetails() {

        return doorRepo.findAll();
    }

    public DharanishModel getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}