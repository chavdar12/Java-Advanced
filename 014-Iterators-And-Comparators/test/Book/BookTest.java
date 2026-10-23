package Book;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static support.Console.check;

class BookTest {
    @Test
    void storesTitleYearAndAuthors() {
        Book book = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");
        assertEquals("The Documents in the Case", book.getTitle());
        assertEquals(1930, book.getYear());
        assertEquals(List.of("Dorothy Sayers", "Robert Eustace"), book.getAuthors());
    }

    @Test
    void noAuthorsGivesEmptyList() {
        assertTrue(new Book("Animal Farm", 2003).getAuthors().isEmpty());
    }

    @Test
    void mainRunsSilently() throws Exception {
        check("", () -> Main.main(new String[0]), "");
    }
}
