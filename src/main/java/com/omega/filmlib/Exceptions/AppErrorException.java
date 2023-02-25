package com.omega.filmlib.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class AppErrorException {
    private Integer code;
    private String message;
}
