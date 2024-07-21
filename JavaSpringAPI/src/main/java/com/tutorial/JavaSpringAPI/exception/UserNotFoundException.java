package com.tutorial.JavaSpringAPI.exception;


//Exception we will use to throw if a user is not available
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
