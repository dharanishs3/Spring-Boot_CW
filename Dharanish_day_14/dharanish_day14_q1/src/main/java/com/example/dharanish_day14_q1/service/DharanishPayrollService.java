package com.example.dharanish_day14_q1.service;


import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.example.dharanish_day14_q1.model.DharanishPayroll;
import com.example.dharanish_day14_q1.repository.DharanishPayrollRepo;


@Service
public class DharanishPayrollService {

    @Autowired
    public DharanishPayrollRepo payrollRepo;

    public List<DharanishPayroll> getData(){
        return payrollRepo.findAll();
    }

    public DharanishPayroll postData(DharanishPayroll e){
        return payrollRepo.save(e);
    }

}
