package com.udemi.springboot_rest_api_students.controller;

import com.udemi.springboot_rest_api_students.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    // http://localhost:8080/student
    @GetMapping("student")
    public ResponseEntity<Student> getStudent(){

        Student student = new Student(
                1,
                "User",
                "UserOne"
        );
//        return new  ResponseEntity<>(student,  HttpStatus.OK);
//        return ResponseEntity.ok(student);
        return ResponseEntity.ok().header("custom-header", "Vardenis")
                .body(student);
    }

    // http://localhost:8080/students
    @GetMapping
    public ResponseEntity<List<Student>>getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Student1", "Student11"));
        students.add(new Student(2, "Student2", "Student22"));
        students.add(new Student(3, "Student3", "Student33"));
        return ResponseEntity.ok(students);
    }

    // Spring BOOT REST API with path Variable
    // {id} - URI template variable
    // http://localhost:8080/students/1
    @GetMapping("/{id}")
    public Student studentPathVariable(@PathVariable("id") int studentId){
        return new Student(studentId, "User4","User44" );
    }

    @GetMapping("/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(@PathVariable("id") int studentId,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("last-name") String lastName){
        return new Student(studentId, firstName,lastName );
    }

    // Spring BOOT REST API with Request Param
    // http://localhost:8080/students/query?id=1
//    @GetMapping("students/query")
//    public Student studentRequestVariable(@RequestParam int id){
//        return new Student(id, "Student5", "Student55");
//    }

    // http://localhost:8080/students/query?id=1&firstName=Vardenis&lastName=Pavardenis
    @GetMapping("/query")
    public ResponseEntity<Student> studentRequestVariable(@RequestParam int id,
                                          @RequestParam String firstName,
                                          @RequestParam String lastName){
        Student student = new Student(id, firstName, lastName);
        return ResponseEntity.ok(student);
    }

    // Spring BOOT REST API that handles HTTP POST Request - creating new resource
    // @PostMapping adn @RequestBody
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

    // Spring BOOT REST API that handles HTTP PUT Request - updating existing resource
    @PutMapping("/{id}/update")
    public Student updateStudent(@RequestBody Student student, @PathVariable("id") int studentId){
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

    // Spring BOOT REST API that handles HTTP DELETE Request - deleting the existing resource
    @DeleteMapping("/{id}/delete")
    public String deleteStudent(@PathVariable("id") int studentId){
        System.out.println(studentId);
        return "Student deleted successfully!.";
    }
}
