package lt.techin.emsbackend_ind.mapper;

import lt.techin.emsbackend_ind.dto.DepartmentDto;
import lt.techin.emsbackend_ind.entity.Department;

public class DepartmentMapper {

    // convert department jpa entity into department dto
    public static DepartmentDto mapDepartmentDto(Department department){
        return new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription()
        );
    }

    // convert department dto entity into department jpa entity
    public static Department mapToDepartment(DepartmentDto departmentDto){
        return new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription()
        );
    }

}
