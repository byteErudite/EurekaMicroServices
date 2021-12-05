package com.vaibhav.moviemegaservice.model;

import java.util.Date;
import java.util.UUID;

public class Rating {
    private UUID ratingId;
    private int rating;
    private Date date;
    private UUID movieId;

    public Rating() {
    }

    public Rating(UUID ratingId, int rating, Date date, UUID movieId) {
        this.ratingId = ratingId;
        this.rating = rating;
        this.date = date;
        this.movieId = movieId;
    }

    public UUID getRatingId() {
        return ratingId;
    }

    public void setRatingId(UUID ratingId) {
        this.ratingId = ratingId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UUID getMovieId() {
        return movieId;
    }

    public void setMovieId(UUID movieId) {
        this.movieId = movieId;
    }
}
