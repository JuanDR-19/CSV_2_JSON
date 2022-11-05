package org.example.Class;

import lombok.Getter;

import java.util.Date;

@Getter
public class Ratings {
    private int movieID;
    private float rating;
    private Date timestamp;
    private int UserID;

    public Ratings(int movieID, float rating, Date timestamp, int userID) {
        this.movieID = movieID;
        this.rating = rating;
        this.timestamp = timestamp;
        UserID = userID;
    }

}
