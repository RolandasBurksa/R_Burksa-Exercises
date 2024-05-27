package lt.techin.emsbackend_ind.service;

import lt.techin.emsbackend_ind.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

   EmployeeDto createEmployee(EmployeeDto employeeDto);

   EmployeeDto getEmployeeById(Long employeeId);

   List<EmployeeDto> getAllEmployees();

   EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

   void deleteEmployee(Long employeeId);
}
