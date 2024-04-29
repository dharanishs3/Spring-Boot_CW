package com.example.dharanish_day12_q2.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DharanishStudentDetail {
    @Id
    public int id;

    public String address;
    public String phoneNumber;

}
