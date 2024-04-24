package com.example.dharanish_day8_q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.dharanish_day8_q1.model.DharanishModel;
import java.util.List;


@Repository
public interface DharanishRepo extends JpaRepository<DharanishModel,Integer>{

    List<DharanishModel> findByNameStartingWith(String name);
    List<DharanishModel> findByNameEndingWith(String name);
    
}
