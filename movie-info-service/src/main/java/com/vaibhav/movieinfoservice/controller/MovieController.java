package com.vaibhav.movieinfoservice.controller;

import com.vaibhav.movieinfoservice.model.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

@RestController
@RequestMapping(path = "movies")
public class MovieController {

    @GetMapping(path = "/{movieId}")
    public ResponseEntity<Movie> getRatingForMovie(@PathVariable UUID movieId) {
        return new ResponseEntity<>(new Movie(movieId, "Die hard", "1989"), HttpStatus.OK);
    }
}
