import org.junit.jupiter.api.Test;

import static support.Console.check;

class ListOfPredicatesTest {
    @Test
    void numbersDivisibleByAll() throws Exception {
        check("2 4 6 8 10", () -> ListOfPredicates.main(new String[0]), "10\n1 1 1 2\n");
        check("20 40 60 80 100", () -> ListOfPredicates.main(new String[0]), "100\n2 5 10 20\n");
    }
}
