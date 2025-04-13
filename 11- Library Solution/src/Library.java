/*
11. Write a Java program to create a class called "Library" with a collection of books
and methods to add and remove books.
*/


import java.util.ArrayList;

public class Library {
    ArrayList<Book> bookCollection = new ArrayList<>();


    public void addBook(Book book){
        bookCollection.add(book);

    }
    public void removeBook(Book book){
        bookCollection.remove(book);
    }
    public void showAllBooks(){

        bookCollection.forEach(n->System.out.printf("The book name is: %s%nThe Author is: %s%nThe year is:%d%n%n", n.getTitle(), n.getAuthor(), n.getYear()));

    }

}
