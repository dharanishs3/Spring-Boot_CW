package com.example.dharanish_day6_q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.dharanish_day6_q2.model.DharanishModel;
import com.example.dharanish_day6_q2.service.DharanishService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class DharanishController {

     @Autowired
     public DharanishService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<DharanishModel>> getDetails() {
          List<DharanishModel> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<DharanishModel>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<DharanishModel>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<DharanishModel> postMethodName(@RequestBody DharanishModel student) {

          DharanishModel postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<DharanishModel>> sortedDetails(@PathVariable String field) {
          List<DharanishModel> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<DharanishModel>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<DharanishModel>>(list, HttpStatus.OK);

     }
}
