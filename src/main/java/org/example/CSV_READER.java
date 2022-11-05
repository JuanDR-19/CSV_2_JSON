package org.example;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CSV_READER {

    private static final String LIST_SPLITTER="!";
    private static final int FILE_SIZE=7;
    private String line=null;

    private List<String> parts = new ArrayList<>();
    private List<String> contents = new ArrayList<>();


    public CSV_READER() throws IOException {
    }

    public void readFileMovies(String path) throws IOException {
        int count=0;
        int file=0;
        JSONwriter jw= new JSONwriter(file);
        try (BufferedReader in = new BufferedReader(new FileReader(path))) { //filename in()

            while((line=in.readLine())!=null){
                parts.add(line); //comma separator
            }
            try {
                for (String part : parts) {
                    int MovID = 0;
                    List<String> Screenwriter = new ArrayList<>();
                    List<String> Subjects = new ArrayList<>();
                    List<String> Directors = new ArrayList<>();
                    List<String> Actors = new ArrayList<>();
                    List<String> Genres = new ArrayList<>();
                    String Name = null;
                    contents = Arrays.asList(part.split(",",FILE_SIZE));
                    MovID = Integer.valueOf(contents.get(0));
                    Name = contents.get(1);

                    String linea = contents.get(2);
                    if(linea.contains(LIST_SPLITTER)){
                        Screenwriter = List.of(linea.split(LIST_SPLITTER));
                    }else if(linea.isEmpty()){
                        Screenwriter=null;
                    }else {
                        Screenwriter.add(linea);
                    }

                    String Subject = contents.get(3); //list
                    if(Subject.contains(LIST_SPLITTER)){
                        Subjects = List.of(Subject.split(LIST_SPLITTER));
                    }else if(Subject.isEmpty()){
                        Subjects=null;
                    }else{
                        Subjects.add(Subject);
                    }

                    String Director = contents.get(4); //list
                    if(Director.contains(LIST_SPLITTER)){
                        Directors = List.of(Director.split(LIST_SPLITTER));
                    }else if(Director.isEmpty()){
                        Directors=null;
                    }else{
                        Directors.add(Director);
                    }

                    String Actor = contents.get(5); //list
                    if(Actor.contains(LIST_SPLITTER)){
                        Actors = List.of(Actor.split(LIST_SPLITTER));
                    }else if(Actor.isEmpty()){
                        Actors=null;
                    }else{
                        Actors.add(Actor);
                    }

                    String Genre = contents.get(6); //list
                    if(Genre.contains(LIST_SPLITTER)){
                        Genres = List.of(Genre.split(LIST_SPLITTER));
                    }else if(Genre.isEmpty()){
                        Genres=null;
                    }else{
                        Genres.add(Subject);
                    }
                    Movie newMovie = new Movie(MovID, Name, Screenwriter, Subjects, Directors, Actors, Genres);
                    Gson gson = new Gson();
                    String JSON = gson.toJson(newMovie);
                    count++;
                    if(count==10000){
                        jw.JSONEnder();
                        count=0;
                        file++;
                        jw= new JSONwriter(file);
                    }
                    jw.write(JSON);
                }
            }catch(Exception e){
                e.printStackTrace();
            }


        }catch(Exception e){
            e.printStackTrace();
        }

    }

}