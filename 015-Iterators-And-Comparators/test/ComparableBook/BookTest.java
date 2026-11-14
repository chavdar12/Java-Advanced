package ComparableBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static support.Console.check;

class BookTest {
    @Test
    void comparesByTitleThenYear() {
        assertTrue(new Book("A", 2000).compareTo(new Book("B", 1900)) < 0);
        assertTrue(new Book("A", 2000).compareTo(new Book("A", 1900)) > 0);
        assertEquals(0, new Book("A", 2000).compareTo(new Book("A", 2000)));
    }

    @Test
    void mainPrintsWhichBookComesFirst() throws Exception {
        check("Animal Farm (2003) is before The Documents in the Case (1930)", () -> Main.main(new String[0]), "");
    }
}
