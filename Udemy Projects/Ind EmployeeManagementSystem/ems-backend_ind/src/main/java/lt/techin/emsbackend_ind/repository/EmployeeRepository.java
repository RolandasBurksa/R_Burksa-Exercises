package lt.techin.emsbackend_ind.repository;

import lt.techin.emsbackend_ind.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
