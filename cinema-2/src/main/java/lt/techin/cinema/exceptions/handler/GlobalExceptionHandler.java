package lt.techin.cinema.exceptions.handler;

import lt.techin.cinema.exceptions.SeatIsOccupiedException;
import lt.techin.cinema.exceptions.SeatNotFoundException;
import lt.techin.cinema.exceptions.handler.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SeatNotFoundException.class)
    public ResponseEntity<ErrorDetails> exceptionSeatNotFoundHandler(SeatNotFoundException ex){
        ErrorDetails errorDetails = new ErrorDetails(ex.getMessage());
        return  new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(SeatIsOccupiedException.class)
    public ResponseEntity<ErrorDetails> exceptionSeatIsOccupiedException(SeatIsOccupiedException ex){
        ErrorDetails errorDetails = new ErrorDetails(ex.getMessage());
        return  new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }
}
