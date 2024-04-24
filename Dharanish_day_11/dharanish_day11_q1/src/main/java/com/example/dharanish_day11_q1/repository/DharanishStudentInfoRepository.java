package com.example.dharanish_day11_q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dharanish_day11_q1.model.DharanishStudentInfo;

@Repository
public interface DharanishStudentInfoRepository extends JpaRepository<DharanishStudentInfo,Integer>{
    
}