package com.example.Dharanish_day12_q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dharanish_day12_q1.model.DharanishAddress;
import com.example.Dharanish_day12_q1.repository.DharanishAddressRepo;


@Service
public class DharanishAddressService {

    @Autowired
    private DharanishAddressRepo addressRepository;

    public List<DharanishAddress> getData(){
        return addressRepository.findAll();
    }

}
