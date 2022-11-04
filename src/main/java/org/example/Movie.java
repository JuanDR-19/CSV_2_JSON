package org.example;


import lombok.Getter;

import java.util.List;

@Getter
public class Movie {
    private int MovID;
    private String Name;
    private List<String> Screenwriter;
    private List<String> Subjects;
    private List<String> Directors;
    private List<String> Actors;
    private List<String> Genres;

    public Movie(int movID, String name, List<String> screenwriter, List<String> subjects, List<String> directors, List<String> actors, List<String> genres) {
        MovID = movID;
        Name = name;
        Screenwriter = screenwriter;
        Subjects = subjects;
        Directors = directors;
        Actors = actors;
        Genres = genres;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "MovID=" + MovID +
                ", Name='" + Name + '\'' +
                ", Screenwriter=" + Screenwriter +
                ", Subjects=" + Subjects +
                ", Directors=" + Directors +
                ", Actors=" + Actors +
                ", Genres=" + Genres +
                '}';
    }
}
