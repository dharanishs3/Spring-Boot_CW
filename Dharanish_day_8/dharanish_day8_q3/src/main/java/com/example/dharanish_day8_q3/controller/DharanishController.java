package com.example.dharanish_day8_q3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.dharanish_day8_q3.model.DharanishModel;
import com.example.dharanish_day8_q3.service.DharanishService;

@RestController
public class DharanishController {
    @Autowired
    private DharanishService studentService;

    @PostMapping("/Student")
    public ResponseEntity<DharanishModel> post(@RequestBody DharanishModel student) {
        if (studentService.post(student)) {
            return new ResponseEntity<>(student, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Student/marksGreaterThan/{mark}")
    public ResponseEntity<List<DharanishModel>> getAll(@PathVariable int mark) {
        List<DharanishModel> li = studentService.start(mark);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/Student/marksLessThan/{mark}")
    public ResponseEntity<List<DharanishModel>> getbyAge(@PathVariable int mark) {
        List<DharanishModel> li = studentService.end(mark);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
