package lt.techin.testemp.ind_ems_backend_test.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class EmployeeAPIException extends RuntimeException{
    private HttpStatus status;
    private String message;
}
