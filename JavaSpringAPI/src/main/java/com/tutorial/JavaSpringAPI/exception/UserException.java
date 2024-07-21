package com.tutorial.JavaSpringAPI.exception;

import org.springframework.http.HttpStatus;

//Exception class we'll use specifically for the User Service. Could probably make this more generic and use it for any service.
public class UserException {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;

    public UserException(String message, Throwable throwable, HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public String getMessage() {
        return message;
    }
}
