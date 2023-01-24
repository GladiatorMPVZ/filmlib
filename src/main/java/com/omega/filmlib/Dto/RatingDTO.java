package com.omega.filmlib.Dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class RatingDTO {

    private Long id;
    @NotEmpty
    private Integer rating;
    private String username;

}
