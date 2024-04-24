package com.example.dharanish_day7_q3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.dharanish_day7_q3.model.DharanishModel;
import java.util.List;

@Repository
public interface DharanishRepo extends JpaRepository<DharanishModel,Integer>{

    List<DharanishModel> findByDoorId(int doorId);
    List<DharanishModel> findByAccessType(String accessType);
    
}
