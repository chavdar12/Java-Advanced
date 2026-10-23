package BookComparator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static support.Console.check;

class BookComparatorTest {
    @Test
    void comparesByTitleThenYear() {
        BookComparator comparator = new BookComparator();
        assertTrue(comparator.compare(new Book("A", 2000), new Book("B", 1900)) < 0);
        assertTrue(comparator.compare(new Book("A", 2000), new Book("A", 1900)) > 0);
        assertEquals(0, comparator.compare(new Book("A", 2000), new Book("A", 2000)));
    }

    @Test
    void mainPrintsSortedBooks() throws Exception {
        check("""
                Animal Farm 2003
                The Documents in the Case 1930
                The Documents in the Case 2002
                """, () -> Main.main(new String[0]), "");
    }
}
