package com.StudentManagementSystem.StudentManagementSystem.services;

import com.StudentManagementSystem.StudentManagementSystem.Mapper.StudentMaper;
import com.StudentManagementSystem.StudentManagementSystem.model.Student;
import com.StudentManagementSystem.StudentManagementSystem.repository.StudentRepository;
import lombok.Delegate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class Studentservices {
    @Delegate
    private final StudentRepository studentRepository;
    private final StudentMaper studentMaper;



}