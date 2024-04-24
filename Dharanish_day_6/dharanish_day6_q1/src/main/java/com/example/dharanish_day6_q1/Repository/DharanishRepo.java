package com.example.dharanish_day6_q1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dharanish_day6_q1.Model.DharanishModel;

@Repository
public interface DharanishRepo extends JpaRepository<DharanishModel,Integer>{

}
