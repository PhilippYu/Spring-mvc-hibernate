package com.myapp.service;

import com.myapp.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    void createStudent(Student student);
}
