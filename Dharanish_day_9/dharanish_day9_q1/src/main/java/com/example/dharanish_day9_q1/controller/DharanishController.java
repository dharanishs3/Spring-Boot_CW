package com.example.dharanish_day9_q1.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dharanish_day9_q1.model.DharanishModel;
import com.example.dharanish_day9_q1.service.DharanishService;

@RestController
public class DharanishController {
    public DharanishService personService;

    public DharanishController(DharanishService personService) {
        this.personService = personService;
    }

    @SuppressWarnings("null")
    @PostMapping("/api/person")
    public ResponseEntity<DharanishModel> postMethodName(@RequestBody DharanishModel person) {
        if (personService.savePerson(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @SuppressWarnings("null")
    @GetMapping("/api/person/byage/{age}")
    public ResponseEntity<List<DharanishModel>> getMethodName(@PathVariable("age") int age) {
        List<DharanishModel> list = personService.getPersonByAge(age);
        if (list.size() == 0) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
