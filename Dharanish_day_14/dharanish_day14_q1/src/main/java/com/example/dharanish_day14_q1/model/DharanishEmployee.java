package com.example.dharanish_day14_q1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DharanishEmployee {

    @Id
    public long employeeId;
    public String employeeName;
    public int age;
    public long mobile;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payroll")
    public DharanishPayroll payroll;

}
