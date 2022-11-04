package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CSV_READER {

    private static final String ListSplitter="_";
    private String line=null;

    private List<String> parts = new ArrayList<>();
    private List<Movie> Movies = new ArrayList<>();
    private List<String> contents = new ArrayList<>();


    public CSV_READER() {
    }

    public void readFileMovies(String path){
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

                    contents = Arrays.asList(part.split(","));
                    if (contents.size() == 6) {
                        MovID = Integer.valueOf(contents.get(0));
                        Name = contents.get(1);
                        String linea = contents.get(2);

                        if(linea.contains(ListSplitter)){
                            Screenwriter = List.of(linea.split(ListSplitter));
                        }else if(linea.isEmpty()){
                            Screenwriter=null;
                        }else {
                            Screenwriter.add(linea);
                        }

                        String Subject = contents.get(3); //list
                        if(Subject.contains(ListSplitter)){
                            Subjects = List.of(Subject.split(ListSplitter));
                        }else if(Subject.isEmpty()){
                            Subjects=null;
                        }else{
                            Subjects.add(Subject);
                        }

                        String Director = contents.get(4); //list
                        if(Director.contains(ListSplitter)){
                            Directors = List.of(Director.split(ListSplitter));
                        }else if(Director.isEmpty()){
                            Directors=null;
                        }else{
                            Directors.add(Director);
                        }

                        String Actor = contents.get(5); //list
                        if(Actor.contains(ListSplitter)){
                                Actors = List.of(Actor.split(ListSplitter));
                        }else if(Actor.isEmpty()){
                            Actors=null;
                        }else{
                            Actors.add(Actor);
                        }
                        Genres=null;

                    } else {
                        MovID = Integer.valueOf(contents.get(0));
                        Name = contents.get(1);

                        String linea = contents.get(2);
                        if(linea.contains(ListSplitter)){
                            Screenwriter = List.of(linea.split(ListSplitter));
                        }else if(linea.isEmpty()){
                            Screenwriter=null;
                        }else {
                            Screenwriter.add(linea);
                        }

                        String Subject = contents.get(3); //list
                        if(Subject.contains(ListSplitter)){
                            Subjects = List.of(Subject.split(ListSplitter));
                        }else if(Subject.isEmpty()){
                            Subjects=null;
                        }else{
                            Subjects.add(Subject);
                        }

                        String Director = contents.get(4); //list
                        if(Director.contains(ListSplitter)){
                            Directors = List.of(Director.split(ListSplitter));
                        }else if(Director.isEmpty()){
                            Directors=null;
                        }else{
                            Directors.add(Director);
                        }

                        String Actor = contents.get(5); //list
                        if(Actor.contains(ListSplitter)){
                            Actors = List.of(Actor.split(ListSplitter));
                        }else if(Actor.isEmpty()){
                            Actors=null;
                        }else{
                            Actors.add(Actor);
                        }

                        String Genre = contents.get(6); //list
                        if(Genre.contains(ListSplitter)){
                            Genres = List.of(Genre.split(ListSplitter));
                        }else if(Genre.isEmpty()){
                            Genres=null;
                        }else{
                            Genres.add(Subject);
                        }
                    }
                    Movie newMovie = new Movie(MovID, Name, Screenwriter, Subjects, Directors, Actors, Genres);
                    Movies.add(newMovie);
                }
            }catch(Exception e){
                e.toString();
            }
            ReadList();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    private void ReadList(){
        for(Movie m : Movies){
            System.out.println(m.toString());
        }
    }
}
