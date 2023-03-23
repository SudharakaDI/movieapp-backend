package com.movies.movieapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    private final MovieRepository repository;

    MovieController(MovieRepository repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/movies")
    List<Movie> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/movies")
    Movie newMovie(@RequestBody Movie newMovie) {
        return repository.save(newMovie);
    }

    // Single item

    @GetMapping("/movies/{id}")
    Movie one(@PathVariable Integer id) {

        return repository.findById(id)
                .orElseThrow(() -> new MovieNotFoundException(id));
    }

//    @PutMapping("/movies/{id}")
//    Movie replaceMovie(@RequestBody Movie newMovie, @PathVariable Integer id) {
//
//        return repository.findById(id)
//                .map(movie -> {
//                    movie.setTitle(newMovie.getTitle());
//                    movie.setDescription(newMovie.getDescription());
//                    return repository.save(movie);
//                })
//                .orElseGet(() -> {
//                    newMovie.setId(id);
//                    return repository.save(newMovie);
//                });
//    }

    @DeleteMapping("/movies/{id}")
    void deleteMovie(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
