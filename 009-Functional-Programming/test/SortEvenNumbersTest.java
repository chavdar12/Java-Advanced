import org.junit.jupiter.api.Test;

import static support.Console.check;

class SortEvenNumbersTest {
    @Test
    void printsEvensThenSortedEvens() throws Exception {
        check("4, 2, 4, 2, 12\n2, 2, 4, 4, 12", () -> SortEvenNumbers.main(new String[0]), "4, 2, 1, 3, 5, 7, 1, 4, 2, 12\n");
    }
}
