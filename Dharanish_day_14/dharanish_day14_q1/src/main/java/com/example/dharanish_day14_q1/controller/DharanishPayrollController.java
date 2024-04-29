package com.example.dharanish_day14_q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;

import org.springframework.web.bind.annotation.*;

import com.example.dharanish_day14_q1.model.DharanishPayroll;
import com.example.dharanish_day14_q1.service.DharanishPayrollService;


@RestController
public class DharanishPayrollController {

    @Autowired
    public DharanishPayrollService payrollService;

    @PostMapping("/employee/{employeeId}/payroll")
    public DharanishPayroll postMethodName(@PathVariable int id,@RequestBody DharanishPayroll entity) {
        return payrollService.postData(entity);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public List<DharanishPayroll> getMethodName() {
        return payrollService.getData();
    }
    
}
