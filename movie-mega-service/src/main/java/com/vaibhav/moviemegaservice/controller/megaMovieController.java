package com.vaibhav.moviemegaservice.controller;

import com.vaibhav.moviemegaservice.model.Movie;
import com.vaibhav.moviemegaservice.model.MovieData;
import com.vaibhav.moviemegaservice.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "megaMovies")
public class megaMovieController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    WebClient.Builder builder;

    @Value("${ratingServiceUrl}")
    String RATING_SERVICE_URL;

    @Value("${movieServiceUrl}")
    String MOVIE_SERVICE_URL;


    @GetMapping(path = "/{movieId}")
    public ResponseEntity<List<MovieData>> getRatingForMovie(@PathVariable UUID movieId) {

//        Movie movie = builder.build().
//                get().
//                uri(MOVIE_SERVICE_URL + movieId).
//                retrieve().
//                bodyToMono(Movie.class).block();
//
//        Rating rating = builder.build().
//                get().
//                uri(RATING_SERVICE_URL + movieId).
//                retrieve().
//                bodyToMono(Rating.class).block();
//        return new ResponseEntity<>(Arrays.asList(new MovieData(movie, rating)), HttpStatus.OK);

        ResponseEntity<Movie> movie = restTemplate.getForEntity(MOVIE_SERVICE_URL + movieId, Movie.class);
        ResponseEntity<Rating> rating = restTemplate.getForEntity(RATING_SERVICE_URL + movieId, Rating.class);
        return new ResponseEntity<>(Arrays.asList(new MovieData(movie.getBody(), rating.getBody())), HttpStatus.OK);
    }
}
