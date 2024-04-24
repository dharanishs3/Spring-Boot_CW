package com.example.dharanishq2.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dharanishq2.Model.DharanishModel;
import com.example.dharanishq2.Service.DharanishService;

@RestController
public class DharanishController {
     public DharanishService dharanishService;
     @SuppressWarnings("null")
    @PostMapping("/api/employee")
     public ResponseEntity<DharanishModel> postMethodName(@RequestBody DharanishModel employee) {
         if(dharanishService.saveEmployee(employee) == true)
         {
             return new ResponseEntity<>(employee,HttpStatus.CREATED);
         }
         
         return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
     }
 
     @SuppressWarnings("null")
    @PutMapping("/api/employee/{employeeId}")
     public ResponseEntity<DharanishModel> putMethodName(@PathVariable("employeeId") int id, @RequestBody DharanishModel employee) {
         if(dharanishService.updateDetails(id,employee) == true)
         {
             return new ResponseEntity<>(employee,HttpStatus.OK);
         }
         
         return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
     }
     
     @SuppressWarnings("null")
    @DeleteMapping("/api/employee/{employeeId}")
     public ResponseEntity<DharanishModel> delete(@PathVariable("employeeId") int id,@RequestBody DharanishModel employee)
     {
         if(dharanishService.deleteEmployee(id) == true)
         {
             return new ResponseEntity<>(employee,HttpStatus.OK);
         }
         return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
     }
}
