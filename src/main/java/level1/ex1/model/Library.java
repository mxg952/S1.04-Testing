package level1.ex1.model;

import java.util.*;

public class Library {

    static List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public static List<Book> getBooks() {
        return books;
    }

    public boolean addBook(Book b) {
        if (books.add(b)) {
            System.out.println("Book added successfully. " + b);
        } else {
            System.out.println("Book is already in the library." + b);
        }
        return false;
    }


    public void showAllBooks() {
        System.out.println("Library:" + books);
    }

    public static Book getBookByPosition(int position) {
        if (books.isEmpty()) {
            throw new IndexOutOfBoundsException("The library is empty.");
        }
        if (position < 0 || position >= books.size()) {
            throw new IndexOutOfBoundsException("Invalid position: " + position);
        }
        Book book = books.get(position);
        System.out.println("The book in position " + position + " is: " + book);
        return book;
    }

    public void addBookWithPosition(int position, String title) {
        if (position < 0 || position > books.size()) {
            throw new IndexOutOfBoundsException("Invalid position: " + position);
        }
        books.add(position, new Book(title));
        System.out.println("Book added at position " + position + ": " + title);
    }

    public boolean removeBook(String title) {
        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                it.remove();
                System.out.println("Book removed: " + title);
                return true;
            }
        }
        System.out.println("Book not found: " + title);
        return false;
    }

}

