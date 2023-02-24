package com.omega.filmlib.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UserExistenceException extends RuntimeException {
    public UserExistenceException(String message) {
        super(message);
    }
}