package com.example.dharanish_day13_q2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DharanishDepartment {
    @Id
    public int departmentId;
    public String departmentName;
    public String departmentEmail;
    public String headOfDepartment;
}
