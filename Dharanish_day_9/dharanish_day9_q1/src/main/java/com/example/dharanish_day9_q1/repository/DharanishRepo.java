package com.example.dharanish_day9_q1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.dharanish_day9_q1.model.DharanishModel;

public interface DharanishRepo extends JpaRepository<DharanishModel, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<DharanishModel> findByAge(int age);
}
