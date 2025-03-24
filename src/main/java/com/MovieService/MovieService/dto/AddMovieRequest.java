package com.MovieService.MovieService.dto;

import lombok.Data;

@Data
public class AddMovieRequest {
    private String title;
    private String description;
}
