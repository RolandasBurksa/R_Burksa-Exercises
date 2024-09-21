package com.techin.learn_spring_boot.repository;

import com.techin.learn_spring_boot.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository <Course, Long> {
}
