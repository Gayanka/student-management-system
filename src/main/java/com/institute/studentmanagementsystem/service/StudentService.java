package com.institute.studentmanagementsystem.service;

import com.institute.studentmanagementsystem.model.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);
    List<Student> getAllStudents();

}
