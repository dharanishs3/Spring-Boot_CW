package com.example.Dharanish_day12_q1.controller;
import com.example.Dharanish_day12_q1.model.DharanishAddress;
import com.example.Dharanish_day12_q1.service.DharanishAddressService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class DharanishAddressController {
    @Autowired
    public DharanishAddressService addressService;

    @PostMapping("/address/employee/{id}")
    public List<DharanishAddress> postMethodName(@PathVariable String entity) {
        return addressService.getData();
    }
    
}
