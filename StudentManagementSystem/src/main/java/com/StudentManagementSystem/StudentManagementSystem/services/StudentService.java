package com.StudentManagementSystem.StudentManagementSystem.services;

import com.StudentManagementSystem.StudentManagementSystem.model.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService {
    Optional<Student> findById(Long id);
    List<Student> findAll();
    Student save(Student student);
    void delete(Student student);
}
