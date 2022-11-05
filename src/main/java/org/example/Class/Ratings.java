package org.example.Class;

import lombok.Getter;

@Getter
public class Ratings {
    private int movieID;
    private int rating;
    private int timestamp;
    private int UserID;

    public Ratings(int movieID, int rating, int timestamp, int userID) {
        this.movieID = movieID;
        this.rating = rating;
        this.timestamp = timestamp;
        UserID = userID;
    }

}
