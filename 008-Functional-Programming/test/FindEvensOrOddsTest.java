import org.junit.jupiter.api.Test;

import static support.Console.check;

class FindEvensOrOddsTest {
    @Test
    void odds() throws Exception {
        check("1 3 5 7 9", () -> FindEvensOrOdds.main(new String[0]), "1 10\nodd\n");
    }

    @Test
    void evensIncludingNegatives() throws Exception {
        check("-4 -2 0 2", () -> FindEvensOrOdds.main(new String[0]), "-4 3\neven\n");
    }
}
