package com.example.dharanish_day15_q3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DharanishModel {
    @Id
    public int id;
    public String name;
    public double price;
}
