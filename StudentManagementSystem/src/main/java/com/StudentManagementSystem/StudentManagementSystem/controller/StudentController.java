package com.StudentManagementSystem.StudentManagementSystem.controller;

import com.StudentManagementSystem.StudentManagementSystem.model.Student;
import com.StudentManagementSystem.StudentManagementSystem.services.Studentservices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {
    private final Studentservices studentservices;

    public Optional<Student> findById(Long id) {
        return studentservices.findById(id);
    }

    public List<Student> findAll() {
        return studentservices.findAll();
    }

    public <S extends Student> S save(S entity) {
        return studentservices.save(entity);
    }

    public void delete(Student entity) {
        studentservices.delete(entity);
    }
}
