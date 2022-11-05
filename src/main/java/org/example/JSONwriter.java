package org.example;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class JSONwriter {
    private static final String PATH = "/Users/juanmanuelduran/Desktop/Movies/DescripcionPeliculas.JSON";
    private PrintWriter out = new PrintWriter(new FileWriter(PATH));



    public JSONwriter() throws IOException {
        out.write("[\n");
    }

    public void write(List<String> File_data) {
        for(String JSON : File_data){
            try {
                out.write("\t"+JSON);
                out.write(",");
                out.write("\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void JSONEnder(){
        out.write("]");
    }
}

