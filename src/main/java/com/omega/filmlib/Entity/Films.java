package com.omega.filmlib.Entity;


import javax.persistence.*;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "films")
@Data
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

    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER, mappedBy = "films", orphanRemoval = true)
    private List<Rating> user_ratings = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    public Films() {
    }


    @ManyToMany
    @JoinTable(
            name = "user_film",
            joinColumns = @JoinColumn(name = "films_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> users;

}
