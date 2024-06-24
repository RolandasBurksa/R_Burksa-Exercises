package lt.techin.testemp.ind_ems_backend_test.repository;

import lt.techin.testemp.ind_ems_backend_test.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
