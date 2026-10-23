import org.junit.jupiter.api.Test;

import static support.Console.check;

class PositionsOfTest {
    @Test
    void printsEveryPosition() throws Exception {
        check("0 1\n1 1\n1 2", () -> PositionsOf.main(new String[0]), "2 3\n1 2 3\n4 2 2\n2\n");
    }

    @Test
    void notFound() throws Exception {
        check("not found", () -> PositionsOf.main(new String[0]), "2 3\n1 -2 -3\n4 -5 6\n5\n");
    }
}
