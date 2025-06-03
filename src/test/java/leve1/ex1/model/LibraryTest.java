package leve1.ex1.model;

import level1.ex1.model.Book;
import level1.ex1.model.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;

    @BeforeEach
    void setUp() {
        library = new Library();
        book1 = new Book("Demian");
        book2 = new Book("Siddartha");


    }

    @Test
    void givenNewBookList_whenInitialized_thenListIsNotNull() {
        assertNotNull(library.getBooks(), "The list is empty.");
    }

    @Test
    void givenBookList_whenAddingMultipleBooks_thenSizeMatchesExpected() {
        library.addBook(this.book1);
        library.addBook(this.book2);
        assertEquals(2, library.getBooks().size(), "The list should increase seize.");
    }

    @Test
    void givenBookList_whenInsertingBook_thenBookIsInCorrectPosition() {
        library.addBook(this.book1);
        library.addBook(this.book2);

        assertEquals(book1, library.getBookByPosition(0), "This book isn't i that position.");
        assertEquals(book2, library.getBookByPosition(1), "This book isn't i that position.");
    }

    @Test
    void givenBookList_whenAddingBooks_thenNoDuplicateTitlesExist() {
        assertTrue(library.addBook(book1), "Must have no duplicates.");
        library.addBook(book1);
    }

    @Test
    void givenBookListAndPosition_whenGettingBookTitle_thenReturnsCorrectTitle() {
        library.addBook(this.book1);
        library.addBook(this.book2);

        String titlePosition1 = library.getBookByPosition(0).getTitle();
        String titlePosition2 = library.getBookByPosition(1).getTitle();
        assertEquals(book1.getTitle(), titlePosition1, "The position is not correct.");
        assertEquals(book2.getTitle(), titlePosition2, "The position is not correct.");

    }

    @Test
    void givenBookList_whenAddingBook_thenListIsModifiedCorrectly() {
        int sizeList = library.getBooks().size();
        library.getBooks().add(book1);

        assertEquals(sizeList + 1, library.getBooks().size(), "Add a book doesent modify the list correctly.");
        assertTrue(library.getBooks().contains(book1), "The list doesnt't contain " + book1);
    }

    @Test
    void givenBookList_whenRemovingBook_thenSizeDecreases() {
        library.addBook(book1);
        int size = library.getBooks().size();
        library.removeBook(book1.getTitle());

        assertEquals(size - 1, library.getBooks().size(), "Remove a book doesn't modify correctly the list.");
    }

    @Test
    void givenBookList_whenAddingOrRemovingBook_thenListRemainsAlphabeticallySorted() {
        library.addBook(this.book1);
        library.addBook(this.book2);

        assertEquals(book1.getTitle(), library.getBookByPosition(0).getTitle(), "The list isn't the correct in Order.");
        assertEquals(book2.getTitle(), library.getBookByPosition(1).getTitle(), "The list isn't the correct in Order.");

        library.addBook(new Book("Angels and Demons"));

        assertEquals(book1.getTitle(), library.getBookByPosition(1).getTitle(), "The list isn't the correct in Order.");
        assertEquals(book2.getTitle(), library.getBookByPosition(2).getTitle(), "The list isn't the correct in Order.");
        assertEquals("Angels and Demons", library.getBookByPosition(0).getTitle());

        library.removeBook(book1.getTitle());

        assertEquals(book2.getTitle(), library.getBookByPosition(1).getTitle(), "The list isn't the correct in Order.");
        assertEquals("Angels and Demons", library.getBookByPosition(0).getTitle(), "The list isn't the correct in Order.");
    }
}