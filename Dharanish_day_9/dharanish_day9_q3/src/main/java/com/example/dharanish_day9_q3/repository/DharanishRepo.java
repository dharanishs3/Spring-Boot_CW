package com.example.dharanish_day9_q3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.dharanish_day9_q3.model.DharanishModel;
import java.util.List;

@Repository
public interface DharanishRepo extends JpaRepository<DharanishModel, Integer> {

    @Query("select v from Village as v where v.villageName=?1")
    DharanishModel findByName(String villageName);

    @Query("select v from Village as v where v.villageId=?1")
    DharanishModel findById(int id);

    @Query("select v from Village as v where v.villagePopulation=?1")
    List<DharanishModel> findByPopulation(int population);

}
