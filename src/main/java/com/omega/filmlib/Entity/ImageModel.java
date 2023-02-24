package com.omega.filmlib.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

public class ImageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Lob
    @Column(name = "LONGBLOB")
    private byte imageBytes[];

    @JsonIgnore
    private Long userId;

    @JsonIgnore
    private Long filmId;

}
