package com.example.dharanish_day12_q2.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DharanishStudent {
    @Id
    public int id;

    public String name;
    public int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "studentDetail")
    public DharanishStudentDetail studentDetail;
}
