package org.example.Class;

import org.example.Interfaces.MoviesInterface;
import org.example.Interfaces.RatingsInterface;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MoviesInterface movieReader =  new CSV_READER();
        movieReader.readFileMovies("/Users/juanmanuelduran/Desktop/Movies/DescripcionPeliculas.csv");
        RatingsInterface RatingsReader = new CSV_READER();
        RatingsReader.readFileRating("/Users/juanmanuelduran/Desktop/Movies/RatingFiltrado.csv");
    }
}