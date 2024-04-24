package com.example.dharanish_day11_q1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dharanish_day11_q1.model.DharanishStudent;
import com.example.dharanish_day11_q1.model.DharanishStudentInfo;
import com.example.dharanish_day11_q1.repository.DharanishStudentInfoRepository;
import com.example.dharanish_day11_q1.repository.DharanishStudentRepository;

@Service
public class DharanishService {
    public DharanishStudentRepository studentRepository;
    public DharanishStudentInfoRepository studentInfoRepository;
    public DharanishService(DharanishStudentRepository studentRepository,DharanishStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public DharanishStudent saveStudent(DharanishStudent student)
    {
        return studentRepository.save(student);
    }
    public DharanishStudentInfo saveStudentInfo(DharanishStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<DharanishStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
