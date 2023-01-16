package com.omega.filmlib.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "genre")
@Data
@NoArgsConstructor
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "genre_name")
    private String username;

    @Column(name = "profile_picture")
    private String photo_url;

    @OneToMany(mappedBy = "genre", cascade = CascadeType.PERSIST)
    private List<Films> films;

    @OneToMany(mappedBy = "genre", cascade = CascadeType.PERSIST)
    private List<Author> authors;

}
