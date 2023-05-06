package com.UST.EmployeePracticeException.exception;

import com.UST.EmployeePracticeException.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
@ResponseStatus
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = IdNotFoundException.class)
    public ResponseEntity<ErrorMessage> handleException2(IdNotFoundException ex){
        ErrorMessage error = new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(value = NameFoundException.class)
    public ResponseEntity<ErrorMessage> handleException2(NameFoundException ex){
        ErrorMessage error = new ErrorMessage(HttpStatus.CONFLICT,ex.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(error);
    }


}
