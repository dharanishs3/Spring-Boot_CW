package com.example.dharanish_day15_q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.dharanish_day15_q2.model.DharanishModel;
import com.example.dharanish_day15_q2.service.DharanishService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@Slf4j
public class DharanishController {
    @Autowired
    public DharanishService playerService;

    @GetMapping("/players")
    public List<DharanishModel> getMethodName() {
        log.info("method={GET}");
        return playerService.getData();
    }

    @GetMapping("/players/{playerId}")
    public DharanishModel getOneMethodName(@PathVariable int id){
        log.info("method={GET}");
        return playerService.getOneData(id);
    }
    
    @PostMapping("/players")
    public DharanishModel postMethodName(@RequestBody DharanishModel entity) {
        log.info("method={POST}");
        return playerService.postData(entity);
    }
    
}
