package com.demo.springboot_rest_api_students_swagger.service;

import com.demo.springboot_rest_api_students_swagger.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student getStudentById(int id);
    Student addStudent(Student student);
    Student updateStudent(int id, Student student);
    void deleteStudent(int id);
}
