/*
Write a Java program to create a class called "Book" with attributes for title,
author, and ISBN, and methods to add and remove books from a collection.
*/


import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String ibsn;
    static ArrayList<Book> bookCollection = new ArrayList<>();


    public Book(String title, String author, String ibsn) {
        this.title = title;
        this.author = author;
        this.ibsn = ibsn;
    }


    public static void addBook(Book book){
        bookCollection.add(book);
    }
    public static void removeBook(Book book){
        bookCollection.remove(book);
    }
    public static void getBooks(){
        bookCollection.forEach(s -> System.out.println( "Author: "+ s.author + " IBSN: " + s.ibsn + " Title: " + s.title));
    }

}
