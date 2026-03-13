package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStudent() {
        Student s = new Student(1, "Rosemary", "Computer Science");
        return s;
    }
}