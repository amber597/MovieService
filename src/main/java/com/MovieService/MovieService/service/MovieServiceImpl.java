package com.MovieService.MovieService.service;

import com.MovieService.MovieService.dto.AddMovieRequest;
import com.MovieService.MovieService.model.Movie;
import com.MovieService.MovieService.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    @Override
    public void addMovie(AddMovieRequest movieRequest) {
        Movie movie = new Movie(movieRequest.getTitle(), movieRequest.getDescription());
        this.movieRepository.save(movie);
    }
}
