package com.example.dharanishq1.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.dharanishq1.Model.DharanishModel;
import com.example.dharanishq1.Repository.DharanishRepo;
import com.example.dharanishq1.Service.DharanishService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class DharanishController {
    public DharanishService productService;
    @SuppressWarnings("null")
    @PostMapping("/api/product")
    public ResponseEntity<DharanishModel> postMethodName(@RequestBody DharanishModel product) {
        if(productService.saveProduct(product) == true)
        {
            return new ResponseEntity<>(product,HttpStatus.CREATED);
        }
        
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PutMapping("/api/product/{productId}")
    public ResponseEntity<DharanishModel> putMethodName(@PathVariable("productId") int id, @RequestBody DharanishModel product) {
        if(productService.updateDetails(id,product) == true)
        {
            return new ResponseEntity<>(product,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
    
    @DeleteMapping("api/product/{productId}")
    public ResponseEntity<DharanishModel> delete(@PathVariable("productId") int id,@RequestBody DharanishModel product)
    {
        if(productService.deleteProductData(id) == true)
        {
            return new ResponseEntity<>(product,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
}
