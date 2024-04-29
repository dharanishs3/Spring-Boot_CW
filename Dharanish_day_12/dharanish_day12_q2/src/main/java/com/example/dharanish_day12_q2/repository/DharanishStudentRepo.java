package com.example.dharanish_day12_q2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.dharanish_day12_q2.model.DharanishStudent;


public interface DharanishStudentRepo extends JpaRepository<DharanishStudent,Integer>{

     @Query("select a,e from StudentDetail a inner join Student e on e.address=a.id")
    public List<DharanishStudent> getByInnerJoin();
    @Query("select a,e from StudentDetail a left outer join Student e on e.address=a.id")
    public List<DharanishStudent> getByLeftOuterJoin();
}
