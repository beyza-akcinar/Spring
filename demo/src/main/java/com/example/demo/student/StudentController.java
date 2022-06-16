package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping
public class StudentController {
    private final StudentService SS;

    @Autowired
    public StudentController(StudentService SS) {
        this.SS = SS;
    }

    @GetMapping
    public List<Student> getStudent() {
        return SS.getStudent();
    }
}
