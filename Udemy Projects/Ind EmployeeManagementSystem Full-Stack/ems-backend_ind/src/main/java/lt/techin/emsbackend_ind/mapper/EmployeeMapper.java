package lt.techin.emsbackend_ind.mapper;

import lt.techin.emsbackend_ind.dto.EmployeeDto;
import lt.techin.emsbackend_ind.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return  new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getDepartment().getId()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        Employee employee = new Employee();
                employee.setId(employeeDto.getId());
                employee.setFirstName(employeeDto.getFirstName());
                employee.setLastName(employeeDto.getLastName());
                employee.setEmail(employeeDto.getEmail());
                return employee;
    }
}

