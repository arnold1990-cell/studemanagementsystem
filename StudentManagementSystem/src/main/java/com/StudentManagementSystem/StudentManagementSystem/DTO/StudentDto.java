package com.StudentManagementSystem.StudentManagementSystem.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Long id;                // Unique student ID (Primary Key)
    private String firstName;       // Student's first name
    private String lastName;        // Student's last name
    private String email;           // Contact email
    private String phoneNumber;     // Contact phone number
    private String address;         // Home address
    private String gender;          // Gender (Male/Female/Other)
    private int age;                // Age of a student
    private String dateOfBirth;     // Date of birth
    private String gradeLevel;      // e.g., Grade 5, Form 2, etc.
    private String enrollmentNumber; // Unique enrollment number
    private String course;          // Course/Program enrolled
    private Double gpa;             // Grade Point Average

}
