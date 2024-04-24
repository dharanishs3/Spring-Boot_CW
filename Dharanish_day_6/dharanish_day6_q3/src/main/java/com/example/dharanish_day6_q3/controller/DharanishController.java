package com.example.dharanish_day6_q3.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.dharanish_day6_q3.model.DharanishModel;
import com.example.dharanish_day6_q3.service.DharanishService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class DharanishController {
    public DharanishService productService;
    public DharanishController(DharanishService productService)
    {
        this.productService = productService;
    }
    @SuppressWarnings("null")
    @PostMapping("/api/product")
    public ResponseEntity<DharanishModel> postMethodName(@RequestBody DharanishModel product) {
        if(productService.postProduct(product))
        {
            return new ResponseEntity<>(product,HttpStatus.CREATED);
        }
        
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @SuppressWarnings("null")
    @GetMapping("/api/product/{offset}/{pagesize}")
    public ResponseEntity<List<DharanishModel>> getMethodName(@PathVariable("offset") int offset,@PathVariable("pagesize") int size) {
        List<DharanishModel> list = productService.pagination(offset,size);
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @SuppressWarnings("null")
    @GetMapping("/api/product/{offset}/{pagesize}/{field}")
    public ResponseEntity<List<DharanishModel>> getSortedPagination(@PathVariable("offset") int offset,@PathVariable("pagesize") int size,@PathVariable("field") String field) {
        List<DharanishModel> list = productService.sortPagination(offset,size,field);
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @SuppressWarnings("null")
    @GetMapping("/api/product/{productId}")
    public ResponseEntity<DharanishModel> getMethodName(@PathVariable("productId") int id) {
        DharanishModel product = productService.getProductById(id);
        if(product==null)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product,HttpStatus.OK);
    }
    
    
}
