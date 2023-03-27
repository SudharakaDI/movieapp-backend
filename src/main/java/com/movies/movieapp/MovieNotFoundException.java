package com.movies.movieapp;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(Integer id) {
        super("Could not find movie "+id);
    }
}
