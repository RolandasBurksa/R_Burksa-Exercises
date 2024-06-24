package lt.techin.testemp.ind_ems_backend_test.mapper;

import lt.techin.testemp.ind_ems_backend_test.dto.DepartmentDto;
import lt.techin.testemp.ind_ems_backend_test.model.Department;

public class DepartmentMapper {

    // Convert department jpa entity to department dto
    public static DepartmentDto mapToDepartmentDto(Department department){
        return new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription()
        );
    }

    // Convert department dop entity to department jpa
    public static Department mapToDepartment(DepartmentDto departmentDto){
        return new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription()
        );
    }
}
