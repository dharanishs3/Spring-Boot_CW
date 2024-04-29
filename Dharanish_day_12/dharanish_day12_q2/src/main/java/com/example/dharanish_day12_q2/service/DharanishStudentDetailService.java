package com.example.dharanish_day12_q2.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dharanish_day12_q2.model.DharanishStudentDetail;
import com.example.dharanish_day12_q2.repository.DharanishStudentDetailRepo;


@Service
public class DharanishStudentDetailService {
    @Autowired
    private DharanishStudentDetailRepo addressRepository;

    public List<DharanishStudentDetail> getData(){
        return addressRepository.findAll();
    }

}
