package com.example.dharanish_day8_q3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.dharanish_day8_q3.model.DharanishModel;
import java.util.List;

@Repository
public interface DharanishRepo extends JpaRepository<DharanishModel, Long> {

    List<DharanishModel> findByMarksGreaterThan(int mark);

    List<DharanishModel> findByMarksLessThan(int mark);

}
