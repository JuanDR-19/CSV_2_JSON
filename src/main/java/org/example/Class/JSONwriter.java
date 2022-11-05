package org.example.Class;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class JSONwriter {
    private static final String PATH = "C:\\Users\\rueda\\Desktop\\Juan\\Movies\\Movies\\";
    private static final String EXTENTION = ".JSON";
    private PrintWriter out;



    public JSONwriter(int file,String File_name) throws IOException {
        this.out= new PrintWriter(new FileWriter(PATH+file+File_name+EXTENTION));
        out.write("[\n");
    }

    public void write(String line) {
            try {
                this.out.write("\t"+line);
                this.out.write(",");
                this.out.write("\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    public void JSONEnder(){
        out.write("]");
        this.out.close();
    }
}