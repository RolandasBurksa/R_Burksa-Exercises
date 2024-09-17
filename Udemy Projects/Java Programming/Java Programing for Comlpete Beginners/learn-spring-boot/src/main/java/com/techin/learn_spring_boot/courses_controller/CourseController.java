package com.techin.learn_spring_boot.courses_controller;

import com.techin.learn_spring_boot.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    // http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(new Course(1, "Learn Microservices", "in28minutes"),
                new Course(2, "Learn Full Stack with Angular and React", "in28minutes"));
    }

    // http://localhost:8080/courses/1
    @GetMapping("/courses/1")
    public Course getACourse() {
        return new Course(3, "Learn Spring Boot", "in28minutes");
    }




}

