package level1.ex1.model;

import level1.ex1.exceptions.NoFoundException;

import java.util.*;

public class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public  List<Book> getBooks() {
        return books;
    }

    public boolean addBook(Book book) {
        if (books.contains(book)) {
            System.out.println("Book is already in the library." + book);
            return false;
        } else {
            books.add(book);
            books.sort(new Comparator<Book>() {
                @Override
                public int compare(Book b1, Book b2) {
                    return b1.getTitle().compareToIgnoreCase(b2.getTitle());
                }
            });
            System.out.println("Book added successfully. " + book);
            return true;
        }
    }

    public void showAllBooks() {
        System.out.println("Library:" + books);
    }

    public Book getBookByPosition(int position) {
        if (books.isEmpty()) {
            throw new NoFoundException("The library is empty.");
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
                books.sort(new Comparator<Book>() {
                    @Override
                    public int compare(Book b1, Book b2) {
                        return b1.getTitle().compareToIgnoreCase(b2.getTitle());
                    }
                });
                System.out.println("Book removed: " + title);
                return true;
            }
        }
        System.out.println("Book not found: " + title);
        return false;
    }

}

