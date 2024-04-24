package com.example.dharanish_day11_q2.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class DharanishStudentInfo {
    @Id
    private int id;
    private String address;
    private String phNo;
}
