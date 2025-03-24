package com.MovieService.MovieService.service;

import com.MovieService.MovieService.dto.AddMovieRequest;
import com.MovieService.MovieService.model.Movie;

import java.util.List;

public interface MovieService {
    public List<Movie> getMovies();
    public void addMovie(AddMovieRequest movieRequest);
}
