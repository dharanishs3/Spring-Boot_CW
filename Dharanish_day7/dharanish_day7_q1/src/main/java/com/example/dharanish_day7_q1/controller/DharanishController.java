package com.example.dharanish_day7_q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dharanish_day7_q1.model.DharanishModel;
import com.example.dharanish_day7_q1.service.DharanishService;

@RestController
public class DharanishController {

     @Autowired
     public DharanishService personService;

     @PostMapping("/api/person")
     public ResponseEntity<DharanishModel> postMethodName(@RequestBody DharanishModel entity) {

          DharanishModel inst = personService.SaveEntity(entity);

          return new ResponseEntity<DharanishModel>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<DharanishModel>> getMethodName() {

          List<DharanishModel> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<DharanishModel>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<DharanishModel>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<DharanishModel> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}