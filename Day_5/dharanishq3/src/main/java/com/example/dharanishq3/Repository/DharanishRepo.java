package com.example.dharanishq3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dharanishq3.Model.DharanishModel;
@Repository
public interface DharanishRepo extends JpaRepository<DharanishModel,Integer> {
  
}
