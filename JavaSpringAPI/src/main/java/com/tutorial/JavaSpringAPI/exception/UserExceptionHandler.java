package com.tutorial.JavaSpringAPI.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice //handle exceptions globally throughout the project.
public class UserExceptionHandler {

    @ExceptionHandler(value={UserNotFoundException.class}) //If UserNotFound is thrown, UserExceptionHandler will intercept it thanks to @ControllerAdvice
    public ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException exception){ //given the thrown exception....
        UserException userException = new UserException(exception.getMessage(), exception.getCause(), HttpStatus.NOT_FOUND); //create a new user exception object with the message and cause from the thrown exception
        return new ResponseEntity<>(userException,HttpStatus.NOT_FOUND); //return this object as a response
    }
}
