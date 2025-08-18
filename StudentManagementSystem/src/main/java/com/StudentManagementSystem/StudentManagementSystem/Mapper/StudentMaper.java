package com.StudentManagementSystem.StudentManagementSystem.Mapper;

import com.StudentManagementSystem.StudentManagementSystem.DTO.StudentDto;
import com.StudentManagementSystem.StudentManagementSystem.model.Student;

public class StudentMaper {
    public static StudentDto mapToDto(Student student) {
        if (student == null) {
            return null;}

            return new StudentDto(
                    student.getId(),
                    student.getFirstName(),
                    student.getLastName(),
                    student.getEmail(),
                    student.getAddress(),
                    student.getGender(),
                    student.getDateOfBirth(),
                    student.getAge(),
                    student.getCourse(),
                    student.getEnrollmentNumber(),
                    student.getPhoneNumber(),
                    student.getGradeLevel(),
                    student.getGpa(),
                    student.getStatus()

            );

        }


    public static Student MmapToStudent(StudentDto studentDto){
        if (studentDto == null) {
            return null;}
        return new Student(
                studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getEmail(),
                studentDto.getPhoneNumber(),
                studentDto.getAddress(),
                studentDto.getGender(),
                studentDto.getAge(),
                studentDto.getDateOfBirth(),
                studentDto.getGradeLevel(),
                studentDto.getEnrollmentNumber(),
                studentDto.getCourse(),
                studentDto.getGpa(),
                studentDto.getStatus()

        );

        }

    }
