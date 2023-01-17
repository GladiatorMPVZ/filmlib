package com.omega.filmlib.Controller;

import com.omega.filmlib.Entity.Films;
import com.omega.filmlib.Services.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/films")
public class FilmController {

    private final FilmService filmService;

    @GetMapping
    public String getAllFilms() {
        return "show all films";
    }

    @GetMapping("/{id}")
    public Films getAllFilms(@PathVariable Long id) {
        return filmService.findFilmsById(id);
    }

    @PostMapping
    public Films saveNewFilms(@RequestBody Films films) {
        films.setId(null);
        return filmService.saveOrUpdateFilms(films);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        filmService.deleteFilmsById(id);
    }

    @PutMapping
    public Films updateFilms(@RequestBody Films films) {
        return filmService.saveOrUpdateFilms(films);
    }

}
