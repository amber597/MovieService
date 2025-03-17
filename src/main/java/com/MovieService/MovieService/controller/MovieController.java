package com.MovieService.MovieService.controller;

import com.MovieService.MovieService.model.Movie;
import com.MovieService.MovieService.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    public final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("")
    List<Movie> getMovies() {
        return movieService.getMovies();
    };
}
