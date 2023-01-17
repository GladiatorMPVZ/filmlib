package com.omega.filmlib.Repository;

import com.omega.filmlib.Entity.Author;
import com.omega.filmlib.Entity.Films;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmsRepository extends JpaRepository<Films, Long> {
}
