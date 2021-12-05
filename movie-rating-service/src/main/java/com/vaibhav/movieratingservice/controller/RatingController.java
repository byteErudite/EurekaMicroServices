package com.vaibhav.movieratingservice.controller;

import com.vaibhav.movieratingservice.Model.Rating;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping(path = "rating")
public class RatingController {

    @GetMapping(path = "/{movieId}")
    public ResponseEntity<Rating> getRatingForMovie(@PathVariable UUID movieId) {
        return new ResponseEntity<>(new Rating(movieId, 5, new Date(), movieId), HttpStatus.OK);
    }
}
