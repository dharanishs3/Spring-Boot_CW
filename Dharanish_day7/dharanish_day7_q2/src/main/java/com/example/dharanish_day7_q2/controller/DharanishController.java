package com.example.dharanish_day7_q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.dharanish_day7_q2.model.DharanishModel;
import com.example.dharanish_day7_q2.service.DharanishService;

@RestController
public class DharanishController {

     @Autowired
     public DharanishService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<DharanishModel> postMethodName(@RequestBody DharanishModel entity) {

          DharanishModel inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<DharanishModel>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<DharanishModel>> getMethodName() {

          List<DharanishModel> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<DharanishModel>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<DharanishModel>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<DharanishModel> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}