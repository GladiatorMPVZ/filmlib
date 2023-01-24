package com.omega.filmlib.Dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Set;

public class FilmDTO {

    private Long id;
    @NotEmpty
    private String film_name;
    @NotEmpty
    private String description;
    private String username;
    private Integer likes;
    private Set<String> usersLiked;

}
