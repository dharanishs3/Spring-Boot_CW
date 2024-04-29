package com.example.Dharanish_day12_q1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DharanishAddress {
    
    @Id
    public int id;

    public String street;
    public String city;

}
