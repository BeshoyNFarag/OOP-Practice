/*
17. Write a Java program to create a class called "Movie" with attributes for title, director, actors,
and reviews, and methods for adding and retrieving reviews.
*/


import java.util.ArrayList;

public class Movie {
    private String title;
    private String director;
    ArrayList<String> actors = new ArrayList<String>();

    public Movie(String title, String director, Reviews<String , String> reviews,  String ... actor) {

        this.title = title;
        this.director = director;
        Reviews.addReview(reviews);

        for (String A : actor){
            actors.add(A);
        }

    }


    public void getActors(){
        System.out.println("Actors: ");
        actors.forEach(n -> System.out.println(n));
        System.out.println();

    }
    public void getTitle(){
        System.out.println("Title: " + title);
        System.out.println();
    }

    public void getDirector(){
        System.out.println("Director: " + director);
        System.out.println();
    }

    public void getReviews(){
        for (Reviews reviews : Reviews.reviewsList){
            System.out.println("The reviewer: " + reviews.reviewerName + "\nRating: " + reviews.reviewerRating);
        }
    }


}
