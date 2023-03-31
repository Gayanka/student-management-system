package com.institute.studentmanagementsystem.service.impl;


import com.institute.studentmanagementsystem.model.Student;
import com.institute.studentmanagementsystem.repository.StudentRepository;
import com.institute.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
