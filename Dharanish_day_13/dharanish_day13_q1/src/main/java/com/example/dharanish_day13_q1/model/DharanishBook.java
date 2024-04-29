package com.example.dharanish_day13_q1.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class DharanishBook {

    @Id
    public int id;

    public String title;
    public String genre;
    public String isbn;

    public int publicationYear;
    public double price;

    @ManyToOne
    @JsonBackReference
    public DharanishAuthor author;

}
