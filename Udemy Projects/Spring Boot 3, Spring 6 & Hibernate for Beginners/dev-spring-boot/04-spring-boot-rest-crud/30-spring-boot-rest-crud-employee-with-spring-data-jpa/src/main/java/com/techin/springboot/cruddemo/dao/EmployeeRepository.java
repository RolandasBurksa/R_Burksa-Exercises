package com.techin.springboot.cruddemo.dao;

import com.techin.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code!
}
