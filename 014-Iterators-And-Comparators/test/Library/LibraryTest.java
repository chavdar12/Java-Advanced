package Library;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static support.Console.check;

class LibraryTest {
    @Test
    void iteratesBooksInOrder() {
        Book first = new Book("A", 1);
        Book second = new Book("B", 2);
        List<Book> seen = new ArrayList<>();
        new Library(first, second).forEach(seen::add);
        assertEquals(List.of(first, second), seen);
    }

    @Test
    void emptyLibrary() {
        assertFalse(new Library().iterator().hasNext());
    }

    @Test
    void mainPrintsTitles() throws Exception {
        check("Animal Farm\nThe Documents in the Case\nThe Documents in the Case", () -> Main.main(new String[0]), "");
    }
}
