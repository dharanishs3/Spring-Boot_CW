package com.example.day_1_q1.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController {
    @GetMapping("/welcome")
    public String getMethodName() {
        return "Welcone Spring Boot!";
    }
    
}
