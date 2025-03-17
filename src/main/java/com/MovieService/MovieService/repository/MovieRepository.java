package com.MovieService.MovieService.repository;

import com.MovieService.MovieService.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
