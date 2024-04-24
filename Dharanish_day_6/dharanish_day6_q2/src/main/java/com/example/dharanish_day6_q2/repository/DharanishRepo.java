package com.example.dharanish_day6_q2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dharanish_day6_q2.model.DharanishModel;

@Repository
public interface DharanishRepo extends JpaRepository<DharanishModel, Integer> {

}