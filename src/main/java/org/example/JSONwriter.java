package org.example;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JSONwriter {
    private static final String PATH = "/Users/juanmanuelduran/Desktop/Movies/DescripcionPeliculas.JSON";
    private PrintWriter out = new PrintWriter(new FileWriter(PATH));

    public JSONwriter() throws IOException {
    }

    public void write(String JSON){
        try {
            out.write(JSON);
            out.write("\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
