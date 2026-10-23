import org.junit.jupiter.api.Test;

import static support.Console.check;

class CustomComparatorTest {
    @Test
    void evensFirstThenOdds() throws Exception {
        check("2 4 6 1 3 5", () -> CustomComparator.main(new String[0]), "1 2 3 4 5 6\n");
    }

    @Test
    void handlesNegatives() throws Exception {
        check("-4 0 -3 -1 7", () -> CustomComparator.main(new String[0]), "-3 0 7 -4 -1\n");
    }
}
