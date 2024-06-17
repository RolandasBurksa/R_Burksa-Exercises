package com.demo.springboot_rest_api_students_swagger.service.impl;

import com.demo.springboot_rest_api_students_swagger.model.Student;
import com.demo.springboot_rest_api_students_swagger.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private List<Student> students = new ArrayList<>();

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    @Override
    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student getStudentById(int id) {
        Optional<Student> student = students.stream()
                .filter(s -> s.getId() == id)
                .findFirst();
        return student.orElse(null);
    }

    @Override
    public Student updateStudent(int id, Student student) {
        Student existingStudent = getStudentById(id);
        if (existingStudent != null){
            existingStudent.setFirstName(student.getFirstName());
            existingStudent.setLastName(student.getLastName());
            return existingStudent;
        }
        return null;
    }

    @Override
    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }
}
