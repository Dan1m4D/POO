package Aula_12.Ex2;
import java.util.*;
import java.io.*;

public class Movie implements Comparable{
    private String name;
    private double score;
    private String rating;
    private String genre;
    private int runtime;

    public Movie(String name, double score, String rating, String genre, int runtime) {
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.runtime = runtime;
    }

    //Getters
    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public String getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public int getRuntime() {
        return runtime;
    }

    public static int compareScore(ArrayList<Movie> al){
        int comp = 0;
        for (int i = 0; i< al.size(); i++)
            comp = Double.compare(al.get(i).getScore(), al.get(i+1).getScore());
        return comp;
    }

    public static int compareRuntime(ArrayList<Movie> al){
        int comp = 0;
        for (int i = 0; i< al.size(); i++)
            comp = Integer.compare(al.get(i).getRuntime(), al.get(i+1).getRuntime());
        return comp;
    }

    //ReadFIle Method
    public static Collection<Movie> getMoviesList (String path) throws FileNotFoundException{
        TreeSet<Movie> movies = new TreeSet<>();
        Scanner sc = new Scanner(new FileReader(path));
        sc.nextLine();
        while(sc.hasNextLine()){
            String[] strAr = sc.nextLine().split("\t");
            Movie m = new Movie(strAr[0], Double.parseDouble(strAr[1]), strAr[2], strAr[3], Integer.parseInt(strAr[4]));
            movies.add(m);
        }
        return movies;
    }



    //Overrides
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
 
        if (!(o instanceof Movie)) {
            return false;
        }
        
        Movie m = (Movie) o;
        
        return name.equalsIgnoreCase(m.name)
                && Double.compare(score, m.score) == 0
                && rating.equalsIgnoreCase(m.rating)
                && genre.equalsIgnoreCase(m.genre)
                && Integer.compare(runtime, m.runtime) == 0;
    }

    @Override
	public String toString() {
	    return String.format ("%-40s %-10.1f %-20s %-20s %-5s ", this.name, this.score, this.rating, this.genre, this.runtime);
		
	}
	
    @Override
    public int compareTo(Object o){
        Movie m = (Movie) o;
        return this.name.compareTo(m.name);
    }

}
