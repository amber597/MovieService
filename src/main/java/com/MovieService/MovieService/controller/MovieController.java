package com.MovieService.MovieService.controller;

import com.MovieService.MovieService.dto.AddMovieRequest;
import com.MovieService.MovieService.model.Movie;
import com.MovieService.MovieService.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    public final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("")
    public List<Movie> getMovies() {
        return movieService.getMovies();
    };

    @PostMapping("/add")
    public ResponseEntity<String> addMovie(@RequestBody AddMovieRequest movieRequest) {
        movieService.addMovie(movieRequest);
        return ResponseEntity.ok("Added movie");
    }

}
