package com.example.dharanish_day15_q3.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.dharanish_day15_q3.model.DharanishModel;
import com.example.dharanish_day15_q3.service.DharanishService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
public class DharanishController {
    @Autowired
    public DharanishService productService;

    @GetMapping("/products")
    public List<DharanishModel> getMethodName() {
        log.info("method:{GET}");
        return productService.getData();
    }

    @GetMapping("/products/{id}")
    public DharanishModel getOneMethodName(@PathVariable int param) {
        log.info("method:{GET}");
        return productService.getOneData(param);
    }

    @PostMapping("/products")
    public DharanishModel postMethodName(@RequestBody DharanishModel entity) {
        log.info("method:{POST}");
        return productService.postData(entity);
    }
    
    @DeleteMapping("products/{id}")
    public String deleteMethodName(@PathVariable int id){
        productService.deleteData(id);
        log.info("method:{DELETE}");
        return "Deleted";
    }
    
    @PutMapping("products/{id}")
    public DharanishModel putMethodName(@PathVariable int id, @RequestBody DharanishModel entity) {
        log.info("method:{PUT}");
        return productService.putData(id, entity);
    }

}
