package lt.techin.testemp.ind_ems_backend_test.repository;

import lt.techin.testemp.ind_ems_backend_test.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {
}
