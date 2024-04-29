package com.example.dharanish_day13_q2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class DharanishStudent {
    @Id
    public int studentId;

    public String name;
    public String email;
    public int age;

    @ManyToOne
    public DharanishDepartment department;
    

}
