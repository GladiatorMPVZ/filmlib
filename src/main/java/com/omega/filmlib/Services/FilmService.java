package com.omega.filmlib.Services;

import com.omega.filmlib.Entity.Films;
import com.omega.filmlib.Repository.FilmsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FilmService {

    private final FilmsRepository filmsRepository;

    public List<Films> findAll() {
        return filmsRepository.findAll();
    }

    public Films findFilmsById(Long id) {
        return filmsRepository.findById(id).orElseThrow();
    }

    public Films saveOrUpdateFilms(Films films) {
        return filmsRepository.save(films);
    }

    public void deleteFilmsById(Long id) {
        filmsRepository.deleteById(id);
    }

}
