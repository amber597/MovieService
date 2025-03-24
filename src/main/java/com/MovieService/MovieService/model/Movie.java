package com.MovieService.MovieService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "movies")
@Data
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    public Movie(String title, String description) {
        this.title = title;
        this.description = description;
    }

}
