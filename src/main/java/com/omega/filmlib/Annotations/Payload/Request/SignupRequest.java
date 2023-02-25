package com.omega.filmlib.Annotations.Payload.Request;

import com.omega.filmlib.Annotations.PasswordMatches;
import com.omega.filmlib.Annotations.ValidEmail;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@PasswordMatches
public class SignupRequest {

    @NotEmpty(message = "Please enter your username")
    private String username;
    @Email(message = "It should have email format")
    @NotBlank(message = "Please enter your email")
    @ValidEmail
    private String email;
    @Size(min = 30)
    @NotEmpty(message = "Password is required")
    private String password;
    private String confirmPassword;

}
