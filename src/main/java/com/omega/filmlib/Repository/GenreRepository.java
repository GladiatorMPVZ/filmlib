package com.omega.filmlib.Repository;

import com.omega.filmlib.Entity.Author;
import com.omega.filmlib.Entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
