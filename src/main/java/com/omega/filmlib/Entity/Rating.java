package com.omega.filmlib.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Films films;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private Long userId;

    @Column(columnDefinition = "rating", nullable = false)
    private Integer rating;

    @Column(updatable = false)
    private LocalDateTime createdDate;

    public Rating() {
    }

    @PrePersist
    protected void onCreate()
    {
        this.createdDate = LocalDateTime.now();
    }

}
