package Aula_12.Ex2;

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

    public int compareScore(Movie o){
        return Double.compare(this.score, o.getScore());
    }
    
    public int compareRuntime(Movie o){
        return Integer.compare(this.runtime, o.getRuntime());
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
	    return String.format ("%-15s %-4.2f %-20s %-20s %-5s ", this.name, this.score, this.rating, this.genre, this.runtime);
		
	}
	
    @Override
    public int compareTo(Object o){
        Movie m = (Movie) o;
        return this.name.compareTo(m.name);
    }

}
