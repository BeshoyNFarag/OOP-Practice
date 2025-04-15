/*
17. Write a Java program to create a class called "Movie" with attributes for title, director, actors,
and reviews, and methods for adding and retrieving reviews.

*/



public class Main {
    public static void main(String[] args) {

        Reviews<String, String> reviews = new Reviews<>("Beshoy", "*****");
        Movie movie = new Movie("Hunger Games", "Director",reviews, "jennifer lawrence","blabla" );
        movie.getActors();
        movie.getTitle();
        movie.getDirector();
        movie.getReviews();

    }
}