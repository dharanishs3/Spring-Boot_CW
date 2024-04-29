package com.example.dharanish_day14_q2.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DharanishBook {

    @Id
    public int bookId;

    public String title;
    public String author;
    public int availableCopies;
    public int totalCopies;

}
