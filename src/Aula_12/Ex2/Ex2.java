package Aula_12.Ex2;
import java.io.*;
import java.util.*;

public class Ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<Movie> movies = new TreeSet<>();
        Scanner fin = new Scanner(new FileReader("src/Aula_12/Ex2/movies.txt"));
        fin.nextLine();

        while (fin.hasNext()) {
            String[] strAr = fin.nextLine().split("\t");
            Movie m = new Movie(strAr[0], Double.parseDouble(strAr[1]), strAr[2], strAr[3], Integer.parseInt(strAr[4]));
            movies.add(m);
        }

        //Iterator
        Iterator<Movie> it = movies.iterator();
        ArrayList<Movie> movieList = new ArrayList<>();

        while (it.hasNext()) {
            movieList.add(it.next());
        }

        for (int i = 0; i < movieList.size(); i++) {
            Movie m1 = movieList.get(i);
            Movie m2 = movieList.get(i + 1);

            /*if(m1.compareRuntime(m2)>0){
                if(m1)
            }*/
        }
    }
}
