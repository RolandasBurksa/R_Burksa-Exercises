package com.demo.springboot_rest_api_students_swagger.controller;

import com.demo.springboot_rest_api_students_swagger.model.Student;
import com.demo.springboot_rest_api_students_swagger.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Spring BOOT REST API that handles HTTP POST Request - creating new resource
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    // Spring BOOT REST API that handles HTTP GET Request
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    // Spring BOOT REST API that handles HTTP GET Request with Request Param
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    // Spring BOOT REST API that handles HTTP PUT Request with Request Param
    @PutMapping("/{id}")
    public Student updatedStudent(@PathVariable int id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }

    // Spring BOOT REST API that handles HTTP PUT Request with Request Param
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }

}
