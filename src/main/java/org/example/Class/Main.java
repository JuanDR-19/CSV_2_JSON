package org.example.Class;

import org.example.Interfaces.MoviesInterface;
import org.example.Interfaces.RatingsInterface;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MoviesInterface movieReader =  new CSV_READER();
        movieReader.readFileMovies("C:\\Users\\rueda\\Desktop\\Juan\\Movies\\Movies\\DescripcionPeliculas.csv");
        RatingsInterface RatingsReader = new CSV_READER();
        RatingsReader.readFileRating("C:\\Users\\rueda\\Desktop\\Juan\\Movies\\Movies\\RatingFiltrado.csv");
    }
}