package com.institute.studentmanagementsystem.controller;

import com.institute.studentmanagementsystem.model.Student;
import com.institute.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        if (student == null || student.getName().isEmpty()) {
            throw new RuntimeException("Student cannot be null or Student name cannot be empty!");
        }
        studentService.saveStudent(student);
        return "New Student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {

        return studentService.getAllStudents();
    }

}
