package com.example.dharanish_day14_q1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DharanishPayroll {


    @Id
    public long payrollId;
    public double amount;
    public int noOfDaysWorked;
    
}
