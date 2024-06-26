package lt.techin.testemp.ind_ems_backend_test.service.impl;

import lombok.AllArgsConstructor;
import lt.techin.testemp.ind_ems_backend_test.dto.LoginDto;
import lt.techin.testemp.ind_ems_backend_test.dto.RegisterDto;
import lt.techin.testemp.ind_ems_backend_test.exception.EmployeeAPIException;
import lt.techin.testemp.ind_ems_backend_test.model.Role;
import lt.techin.testemp.ind_ems_backend_test.model.User;
import lt.techin.testemp.ind_ems_backend_test.repository.RoleRepository;
import lt.techin.testemp.ind_ems_backend_test.repository.UserRepository;
import lt.techin.testemp.ind_ems_backend_test.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;
    private AuthenticationManager authenticationManager;

    @Override
    public String register(RegisterDto registerDto) {

        // Check if username is db
        if(userRepository.existsByUsername(registerDto.getUsername())){
            throw new EmployeeAPIException(HttpStatus.BAD_REQUEST, "Username already exists!.");
        }

        // Check if email is db
        if(userRepository.existsByEmail(registerDto.getEmail())){
            throw new EmployeeAPIException(HttpStatus.BAD_REQUEST, "Email already exists!.");
        }

        User user = new User();
        user.setName(registerDto.getName());
        user.setUsername(registerDto.getUsername());
        user.setEmail(registerDto.getEmail());
        user.setPassword(passwordEncoder.encode(registerDto.getPassword()));

        Set<Role> roles = new HashSet<>();
        Role userRole = roleRepository.findByName("ROLE_USER");
        if (userRole == null) {
            throw new EmployeeAPIException(HttpStatus.INTERNAL_SERVER_ERROR, "Default role not found!.");
        }
        roles.add(userRole);

        user.setRoles(roles);

        userRepository.save(user);

        return "User Registered Successfully!.";
    }

    @Override
    public String login(LoginDto loginDto) {

        Authentication authentication =  authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getUsernameOrEmail(),
                loginDto.getPassword()
        ));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        return "User logged-in successfully!.";
    }
}
