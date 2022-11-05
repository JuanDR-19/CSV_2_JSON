package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CSV_READER reader = new CSV_READER();
        reader.readFileMovies("/Users/juanmanuelduran/Desktop/Movies/DescripcionPeliculas.csv");
    }
}