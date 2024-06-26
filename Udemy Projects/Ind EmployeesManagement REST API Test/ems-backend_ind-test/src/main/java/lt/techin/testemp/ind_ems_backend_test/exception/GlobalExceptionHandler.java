package lt.techin.testemp.ind_ems_backend_test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeAPIException.class)
    public ResponseEntity<ErrorDetails> handleEmployeeAPIException(EmployeeAPIException exception,
                                                                   WebRequest webRequest){
        ErrorDetails errorDetails = new ErrorDetails(
                LocalDateTime.now(),
                exception.getMessage(),
                webRequest.getDescription(false)
        );

        return  new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);

    }
}
