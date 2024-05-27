package lt.techin.emsbackend_ind.service.impl;

import lombok.AllArgsConstructor;
import lt.techin.emsbackend_ind.dto.EmployeeDto;
import lt.techin.emsbackend_ind.entity.Department;
import lt.techin.emsbackend_ind.entity.Employee;
import lt.techin.emsbackend_ind.exception.ResourceNotFoundException;
import lt.techin.emsbackend_ind.mapper.EmployeeMapper;
import lt.techin.emsbackend_ind.repository.DepartmentRepository;
import lt.techin.emsbackend_ind.repository.EmployeeRepository;
import lt.techin.emsbackend_ind.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    private DepartmentRepository departmentRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);

        Department department = departmentRepository.findById(employeeDto.getDepartmentId())
                .orElseThrow(()->
                        new ResourceNotFoundException("Department does not exist with given id:" + employeeDto.getDepartmentId()));

        employee.setDepartment(department);

        Employee sevedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(sevedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(()->
                        new ResourceNotFoundException("Employee does not exist with given id:" + employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
       List<Employee> employees =  employeeRepository.findAll();
        return employees.stream().map((employee) -> EmployeeMapper.mapToEmployeeDto(employee))
                .collect(Collectors.toList());

    }

    @Override
    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee) {

        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                () -> new ResourceNotFoundException("Employee does not exist with given id:" + employeeId)
        );

        employee.setFirstName(updatedEmployee.getFirstName());
        employee.setLastName((updatedEmployee.getLastName()));
        employee.setEmail(updatedEmployee.getEmail());

        Department department = departmentRepository.findById(updatedEmployee.getDepartmentId())
                .orElseThrow(()->
                        new ResourceNotFoundException("Department does not exist with given id:" + updatedEmployee.getDepartmentId()));

        employee.setDepartment(department);

        Employee updatedEmployeeObj = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(updatedEmployeeObj);
    }

    @Override
    public void deleteEmployee(Long employeeId) {

        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                () -> new ResourceNotFoundException("Employee does not exist with given id:" + employeeId)
        );

        employeeRepository.deleteById(employeeId);

    }


}
