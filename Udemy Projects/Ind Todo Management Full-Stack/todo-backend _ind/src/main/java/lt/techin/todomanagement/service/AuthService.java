package lt.techin.todomanagement.service;

import lt.techin.todomanagement.dto.JwtAuthResponse;
import lt.techin.todomanagement.dto.LoginDto;
import lt.techin.todomanagement.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);

//    String login(LoginDto loginDto);

    JwtAuthResponse login(LoginDto loginDto);
}
