/*
11. Write a Java program to create a class called "Library" with a collection of books
and methods to add and remove books.

*/


public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("To Kill a Mockingbird","George Orwell", 1949);
        Book book2 = new Book("The Great Gatsby","F. Scott Fitzgerald", 1925);
        Book book3 = new Book("The Catcher in the Rye","Jane Austen", 1813);
        Book book4 = new Book("To Kill a Mockingbird","J.D. Salinger", 1951);


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.showAllBooks();

        library.removeBook(book4);
        library.showAllBooks();
    }
}