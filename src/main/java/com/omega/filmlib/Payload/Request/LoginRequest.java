package com.omega.filmlib.Payload.Request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginRequest {

    @NotEmpty(message = "username can not be empty")
    private String username;
    @NotEmpty(message = "password can not be empty")
    private String password;

}
