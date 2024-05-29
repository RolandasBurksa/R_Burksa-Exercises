package lt.techin.emsbackend_ind.service.impl;

import lombok.AllArgsConstructor;
import lt.techin.emsbackend_ind.dto.DepartmentDto;
import lt.techin.emsbackend_ind.entity.Department;
import lt.techin.emsbackend_ind.exception.ResourceNotFoundException;
import lt.techin.emsbackend_ind.mapper.DepartmentMapper;
import lt.techin.emsbackend_ind.repository.DepartmentRepository;
import lt.techin.emsbackend_ind.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto createDepartment(DepartmentDto departmentDto) {

        Department department = DepartmentMapper.mapToDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);
        return DepartmentMapper.mapDepartmentDto(savedDepartment);
    }

    @Override
    public DepartmentDto getDepartmentById(Long departmentId) {
       Department department = departmentRepository.findById(departmentId).orElseThrow(
                ()-> new ResourceNotFoundException("Department does not exist with a given id:" + departmentId)
        );
        return DepartmentMapper.mapDepartmentDto(department);
    }

    @Override
    public List<DepartmentDto> getAllDepartments() {
       List<Department> departments = departmentRepository.findAll();
        return departments.stream().map((department)-> DepartmentMapper.mapDepartmentDto(department))
                .collect(Collectors.toList());
    }

    @Override
    public DepartmentDto updateDepartment(Long departmentId, DepartmentDto updatedDepartment) {
        Department department = departmentRepository.findById(departmentId).orElseThrow(
                ()-> new ResourceNotFoundException("Department does not exist with a given id:" + departmentId)
        );
        department.setDepartmentName(updatedDepartment.getDepartmentName());
        department.setDepartmentDescription(updatedDepartment.getDepartmentDescription());

        Department sevedDepartment =  departmentRepository.save(department);

        return DepartmentMapper.mapDepartmentDto(sevedDepartment);
    }

    @Override
    public void deleteDepartment(Long departmentId) {
        Department department = departmentRepository.findById(departmentId).orElseThrow(
                ()-> new ResourceNotFoundException("Department does not exist with a given id:" + departmentId)
        );

        departmentRepository.deleteById(departmentId);
    }
}
