package lt.techin.testemp.ind_ems_backend_test.repository;

import lt.techin.testemp.ind_ems_backend_test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

   Optional<User> findByUsername(String username);

   Boolean existsByEmail(String email);

   Optional<User> findByUsernameOrEmail(String username, String email);
}
