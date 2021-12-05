package com.vaibhav.movieinfoservice.model;

import java.util.UUID;

public class Movie {
    private UUID movieId;
    private String movieName;
    private String releaseYear;

    public Movie(UUID movieId, String movieName, String releaseYear) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.releaseYear = releaseYear;
    }

    public UUID getMovieId() {
        return movieId;
    }

    public void setMovieId(UUID movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }
}
