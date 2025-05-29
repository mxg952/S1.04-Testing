package level1.ex1.model;

import java.util.Objects;

public class Book {

    private String title;

    public Book(String name) {
        this.title = name;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "\nTitle: " + title ;
    }
}
