package com.example.dharanish_day9_q2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.dharanish_day9_q2.model.DharanishModel;
import java.util.List;


@Repository
public interface DharanishRepoRepo extends JpaRepository<DharanishModel,Integer>{

    @Query("select r from Recipe r where recipeName=?1")
    List<DharanishModel> findByProduct(String name);
    
}
