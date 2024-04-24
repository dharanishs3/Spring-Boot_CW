package com.example.dharanish_day11_q2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dharanish_day11_q2.model.DharanishStudent;

@Repository
public interface DharanishStudentRepository extends JpaRepository<DharanishStudent,Integer>{
    
}
