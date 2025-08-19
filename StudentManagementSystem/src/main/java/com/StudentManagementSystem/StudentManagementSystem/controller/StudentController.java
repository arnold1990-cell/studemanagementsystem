package com.StudentManagementSystem.StudentManagementSystem.controller;

import com.StudentManagementSystem.StudentManagementSystem.model.Student;
import com.StudentManagementSystem.StudentManagementSystem.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
        return studentService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteStudent(@PathVariable Long id) {
        return studentService.findById(id)
                .map(student -> {
                    studentService.delete(student);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
