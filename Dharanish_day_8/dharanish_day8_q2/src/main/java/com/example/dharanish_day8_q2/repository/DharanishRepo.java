package com.example.dharanish_day8_q2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.dharanish_day8_q2.model.DharanishModel;
import java.util.List;


@Repository
public interface DharanishRepo extends JpaRepository<DharanishModel,Integer>{

    List<DharanishModel> findByProductNameStartingWith(String name);
    List<DharanishModel> findByProductNameEndingWith(String name);
    
}
