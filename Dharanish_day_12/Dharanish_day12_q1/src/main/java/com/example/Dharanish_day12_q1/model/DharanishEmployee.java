package com.example.Dharanish_day12_q1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DharanishEmployee {
    @Id
    public int id;
    
    public String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address")
    public DharanishAddress address;
}
