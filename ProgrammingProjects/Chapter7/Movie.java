/*
 * Jonathan Limpus 
 * Chapter 7 Progamming Project
 * Movie.java
 */
public class Movie {
    private String movieTitle,
        movieStudio,
        rating,
        releaseYear,
        runTime;

    Movie() {
        movieTitle = "";
        movieStudio = "";
        rating = "";
        releaseYear = "";
        runTime = "";
    }

    Movie(String movieTitle, String movieStudio, String rating, String releaseYear, String runTime) {
        this.movieTitle = movieTitle;
        this.movieStudio = movieStudio;
        this.rating = rating;
        this.releaseYear = releaseYear;
        this.runTime = runTime;
    }

    public String getTitle() {
        return movieTitle;
    }
    
    public String getStudio() {
        return movieStudio;
    }

    public String getRating() {
        return rating;
    }

    public String getYear() {
        return releaseYear;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setStudio(String movieStudio) {
        this.movieStudio = movieStudio;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public void print() {
        System.out.println(movieTitle);
        System.out.println(movieStudio);
        System.out.println(rating);
        System.out.println(releaseYear);
        System.out.println(runTime + "\n");
    }
}