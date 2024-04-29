package com.example.Dharanish_day12_q1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Dharanish_day12_q1.model.DharanishEmployee;

public interface DharanishEmployeeRepo extends JpaRepository<DharanishEmployee,Integer> {

    @Query("select a,e from Address a inner join Employee e on e.address=a.id")
    public List<DharanishEmployee> getByInnerJoin();
    @Query("select a,e from Address a left outer join Employee e on e.address=a.id")
    public List<DharanishEmployee> getByLeftOuterJoin();
}
