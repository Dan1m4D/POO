package Aula_12.Ex2;
import javax.sound.midi.SysexMessage;
import java.io.*;
import java.sql.SQLSyntaxErrorException;
import java.util.*;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        TreeSet<Movie> movies = (TreeSet<Movie>) Movie.getMoviesList("src/Aula_12/Ex2/movies.txt");
        ArrayList<Movie> comedy = new ArrayList<>();

        //Iterator
        Iterator<Movie> it = movies.iterator();
        ArrayList<Movie> movieList = new ArrayList<>();

        while (it.hasNext()) {
            movieList.add(it.next());
        }

        //MovieList
        System.out.println("""
                    Movies List
                    -------------------------------------------""");

        for (Movie m : movieList){
            System.out.println(m);
        }

        System.out.println("===========================================");

        //Collections.sort(movieList, Movie.compareScore(movieList));

        /*for (int i = 0; i < movieList.size(); i++) {
            Movie m1 = movieList.get(i);
            Movie m2 = movieList.get(i + 1);


            if(m1.compareRuntime(m2)>0){
                if(m1)
            }
        }*/

        //d
        for (Movie m : movieList){
            if (m.getGenre().equalsIgnoreCase("comedy")){
                comedy.add(m);
            }
        }

        System.out.println("""
                    Comedy Movies
                    -------------------------------------------""");

        for (Movie s: comedy)
            System.out.printf("o> %s\n", s);

        System.out.println("===========================================");

        //e
        try{
            FileWriter writer = new FileWriter("src/Aula_12/Ex2/myselection.txt");
            for (Movie m : comedy) {
                if (m.getScore() > 60 && m.getGenre().equalsIgnoreCase("comedy")) {
                    writer.write(m.toString());
                }
            }
            writer.close();
            System.out.println("Successfully wrote on file 'myselection.txt'");
            System.out.println("===========================================");
        }
        catch(IOException e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }
}
