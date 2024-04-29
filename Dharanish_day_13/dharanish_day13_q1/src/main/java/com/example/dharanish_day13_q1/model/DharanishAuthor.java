package com.example.dharanish_day13_q1.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class DharanishAuthor {
    @Id
    public int id;

    public String name;
    public String email;
    public String phoneNumber;
    public String address;

    @OneToMany(mappedBy = "author")
    @JsonManagedReference
    public List<DharanishBook> books;

}
