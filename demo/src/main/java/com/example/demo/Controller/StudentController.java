package com.example.demo.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/welcome")
public class StudentController {
    @GetMapping("/start")
    public String welcomeString(){
        return "Welcome you all";
    }
}
