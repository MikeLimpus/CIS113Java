/*
 * Jonathan Limpus
 * Chapter 7 Programming Project
 * MovieClient.java
 */
public class MovieClient {
    public static void main(String args[]) {
        Movie drive = new Movie("Drive", "FilmDistict", "R", "2011", "1h 40m");
        Movie raiders = new Movie("Raiders of the Lost Ark", "Paramount Pictures", "PG", "1981", "1h 55min");
        Movie johnWick = new Movie("John Wick", "Summit Entertainment", "R", "2014", "1h 41min");

        //Calls print method from Movie.java 
        drive.print();
        raiders.print();
        johnWick.print();
    }
}