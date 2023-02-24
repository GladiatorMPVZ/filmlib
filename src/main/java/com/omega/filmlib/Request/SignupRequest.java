package com.omega.filmlib.Request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class SignupRequest {

    @Email(message = "It should have email format")
    @NotBlank(message = "User email is required")
    private String email;
    @NotEmpty(message = "Please enter your name")
    private String username;
    @NotEmpty(message = "Password is required")
    @Size(min = 6)
    private String password;
    private String confirmPassword;


}
