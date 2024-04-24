package com.example.dharanish_day11_q2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dharanish_day11_q2.model.DharanishStudent;
import com.example.dharanish_day11_q2.repository.DharanishStudentRepository;

@Service
public class DharanishService {
    public DharanishStudentRepository studentRepository;
    public DharanishService(DharanishStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public DharanishStudent saveStudent(DharanishStudent student)
    {
        return studentRepository.save(student);
    }
    public List<DharanishStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
