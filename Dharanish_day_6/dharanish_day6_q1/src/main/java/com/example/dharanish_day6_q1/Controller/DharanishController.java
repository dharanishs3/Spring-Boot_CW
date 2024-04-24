package com.example.dharanish_day6_q1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dharanish_day6_q1.Model.DharanishModel;
import com.example.dharanish_day6_q1.Service.DharanishService;

@RestController
public class DharanishController {
    @Autowired
    public DharanishService dharanishService;

    @GetMapping("/api/children/sortBy/{babyFirstName}")
    public ResponseEntity<List<DharanishModel>> sort(@PathVariable String babyFirstName) {
         List<DharanishModel> child = dharanishService.sort(babyFirstName);

         if (child.isEmpty()) {

              return new ResponseEntity<>(child, HttpStatus.NOT_FOUND);
         }
         return new ResponseEntity<>(child, HttpStatus.OK);

    }

    // Pagination
    @GetMapping("api/children/{offset}/{pagesize}")
    public ResponseEntity<List<DharanishModel>> pagination(@PathVariable int offset, @PathVariable int pagesize) {
         List<DharanishModel> pages = dharanishService.pagination(offset, pagesize);
         if (pages.isEmpty()) {
              return new ResponseEntity<List<DharanishModel>>(pages, HttpStatus.NOT_FOUND);
         }
         return new ResponseEntity<List<DharanishModel>>(pages, HttpStatus.OK);
    }

    @GetMapping("/api/children/{offset}/{pagesize}/{field}")
    public ResponseEntity<List<DharanishModel>> sortedPage(@PathVariable int offset, @PathVariable int pagesize,
              @PathVariable String field) {
         List<DharanishModel> sortedPage = dharanishService.sortedPage(offset, pagesize, field);
         if (sortedPage.isEmpty()) {

              return new ResponseEntity<>(sortedPage, HttpStatus.NOT_FOUND);
         }
         return new ResponseEntity<>(sortedPage, HttpStatus.OK);
    }

    @PostMapping("/api/children")
    public ResponseEntity<DharanishModel> postDetails(@RequestBody DharanishModel children) {

         return new ResponseEntity<DharanishModel>(dharanishService.save(children), HttpStatus.CREATED);
    }
}
