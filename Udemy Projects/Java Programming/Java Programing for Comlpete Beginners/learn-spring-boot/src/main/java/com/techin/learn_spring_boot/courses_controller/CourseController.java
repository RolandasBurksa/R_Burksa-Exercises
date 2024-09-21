package com.techin.learn_spring_boot.courses_controller;

import com.techin.learn_spring_boot.bean.Course;
import com.techin.learn_spring_boot.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository repository;

    // http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
//        return Arrays.asList(new Course(1, "Learn Microservices", "in28minutes"),
//                new Course(2, "Learn Full Stack with Angular and React", "in28minutes"));
        return repository.findAll();
    }

    // http://localhost:8080/courses/1
    @GetMapping("/courses/{id}")
    public Course getACourse(@PathVariable long id) {
        Optional<Course> course = repository.findById(id);

        if(course.isEmpty()) {
            throw new  RuntimeException("Course do not found with id " + id);
        }
        return course.get();
//        return new Course(1, "Learn Spring Boot", "in28minutes");
    }

    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course){
        repository.save(course);
    }

    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable long id, @RequestBody Course course){
        repository.save(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id){
        repository.deleteById(id);
    }
}

