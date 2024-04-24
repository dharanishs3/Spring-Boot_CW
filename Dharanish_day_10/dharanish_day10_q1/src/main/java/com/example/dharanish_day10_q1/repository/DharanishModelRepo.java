package com.example.dharanish_day10_q1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.dharanish_day10_q1.model.DharanishModel;

// import jakarta.transaction.Transactiona

@Repository
public interface DharanishModelRepo extends JpaRepository<DharanishModel, Integer> {

    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<DharanishModel> findByColor(String color);

    public List<DharanishModel> findByDoorType(String doortype);
}
