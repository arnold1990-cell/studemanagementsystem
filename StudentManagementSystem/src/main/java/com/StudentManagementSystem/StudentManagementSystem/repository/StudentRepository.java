package com.StudentManagementSystem.StudentManagementSystem.repository;

import com.StudentManagementSystem.StudentManagementSystem.model.Student;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {


    }


