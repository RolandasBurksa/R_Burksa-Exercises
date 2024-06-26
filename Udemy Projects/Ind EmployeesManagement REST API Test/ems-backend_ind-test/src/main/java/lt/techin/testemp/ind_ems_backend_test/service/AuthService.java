package lt.techin.testemp.ind_ems_backend_test.service;

import lt.techin.testemp.ind_ems_backend_test.dto.LoginDto;
import lt.techin.testemp.ind_ems_backend_test.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);

    String login(LoginDto loginDto);

}
