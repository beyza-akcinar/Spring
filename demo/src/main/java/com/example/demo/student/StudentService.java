package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository SR;

    @Autowired
    public StudentService(StudentRepository SR) {
        this.SR = SR;
    }

    public List<Student> getStudent() {
        return  SR.findAll();
    }
}
