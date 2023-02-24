package com.omega.filmlib.Entity;

import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "author")
@Data
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "author_name")
    private String name;

    @Column(name = "profile_picture")
    private String photo_url;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

}
