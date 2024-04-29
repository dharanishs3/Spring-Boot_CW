package com.example.dharanish_day15_q1.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class DharanishModel {
    @Id
    public int  id;
    public String firstName;
    public String lasttName;
}
