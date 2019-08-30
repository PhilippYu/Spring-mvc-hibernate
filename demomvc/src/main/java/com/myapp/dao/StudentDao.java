package com.myapp.dao;

import com.myapp.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentDao {
    List<Student> getAllStudents();
}
