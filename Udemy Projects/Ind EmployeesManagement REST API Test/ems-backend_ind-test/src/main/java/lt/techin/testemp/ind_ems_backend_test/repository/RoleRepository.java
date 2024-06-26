package lt.techin.testemp.ind_ems_backend_test.repository;

import lt.techin.testemp.ind_ems_backend_test.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
