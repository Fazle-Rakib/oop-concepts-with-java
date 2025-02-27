package java_relationships;

import java.util.List;
import java.util.ArrayList;

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println(name + " Library Books:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle());
        }
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Library library = new Library("City Library");

        Book book1 = new Book("Java Programming");
        Book book2 = new Book("Python Basics");

        library.addBook(book1);
        library.addBook(book2);

        library.showBooks(); // Shows books in library

        // Books still exist if library is removed
    }
}
