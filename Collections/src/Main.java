/*
Write a Java program to create a class called "Book" with attributes for title,
author, and ISBN, and methods to add and remove books from a collection.
*/

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("the richest man in babylon", "dont know", "XVS253" );
        Book.addBook(myBook);
        Book secondBook = new Book("the intelligent investor", "dont know", "VVS243");
        Book.addBook(secondBook);
        Book.getBooks();
        Book.removeBook(secondBook);
        System.out.println();
        Book.getBooks();


    }
}