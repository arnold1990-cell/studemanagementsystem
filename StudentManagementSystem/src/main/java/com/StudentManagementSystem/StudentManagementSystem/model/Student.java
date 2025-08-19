package com.StudentManagementSystem.StudentManagementSystem.model;

import com.StudentManagementSystem.StudentManagementSystem.enums.StudentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;                 // Unique student ID (Primary Key)
    @Column(name = "first_name",nullable = false,length = 40)
    private String firstName;       // Student's first name
    @Column(name = "last_name",nullable = false,length = 40)
    private String lastName;        // Student's last name
    @Column(name = "email",nullable = false,unique = false)
    private String email;           // Contact email
    @Column(name = "phone_number",nullable = false,length = 12)
    private String phoneNumber;     // Contact phone number
    @Column(name = "address",nullable = false,length = 30)
    private String address;         // Home address
    @Column(name = "gender",nullable = false)
    private String gender;          // Gender (Male/Female/Other)
    @Column(name = "age",nullable = false)
    private int age;                // Age of a student
    @Column(name = "date_of_birth",nullable = false)
    private String dateOfBirth;     // Date of birth
    @Column(name = "grade_level",nullable = false)
    private String gradeLevel;      // e.g., Grade 5, Form 2, etc.
    @Column(name = "enrollment_number",nullable = false,unique = false)
    private String enrollmentNumber; // Unique enrollment number
    @Column(name = "course",nullable = false)
    private String course;          // Course/Program enrolled
    @Column(name = "gpa",nullable = false)
    private Double gpa;             // Grade Point Average

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StudentStatus studentStatus;

}
