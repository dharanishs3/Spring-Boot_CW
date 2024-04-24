package com.example.dharanishq1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dharanishq1.model.DharanishModel;

@Repository
public interface DharanishRepo extends JpaRepository<DharanishModel,Integer>{
    
}
