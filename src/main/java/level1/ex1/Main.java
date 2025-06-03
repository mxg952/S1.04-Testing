package level1.ex1;

import level1.ex1.model.Book;
import level1.ex1.model.Library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        System.out.println("\nAdding books to the library");
        library.addBook(new Book("The lord of rings"));
        library.addBook(new Book("El principe de la niebla"));
        library.addBook(new Book("Hobit"));
        library.addBook(new Book("Lords of Dogtown"));
        library.showAllBooks();

        System.out.println("\nGeting book by position: ");
        library.showAllBooks();
        int position = 3;
        System.out.println("Position" + position);


        Book book = new Book("Alicia en el país de les maravelles");
        System.out.println("\nAdding a book by position: " + position);
        library.addBookWithPosition(position , "Alicia en el pais de les maravelles");
        library.showAllBooks();

        System.out.println("\nDeleting a book by title:");
        library.removeBook("El principe de la niebla");
        library.removeBook("Alicia en el pais de les maravelles");
        library.removeBook("Demian");

        library.showAllBooks();

    }
}