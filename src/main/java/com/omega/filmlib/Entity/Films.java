package com.omega.filmlib.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "films")
@Data
@NoArgsConstructor
public class Films {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "film_name")
    private String film_name;

    @Column(name = "release_year")
    private String release_year;

    @Column(name = "description")
    private String description;

    @Column(name = "film_picture")
    private String film_picture_url;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @ManyToMany
    @JoinTable(
            name = "user_film",
            joinColumns = @JoinColumn(name = "films_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> users;

}
