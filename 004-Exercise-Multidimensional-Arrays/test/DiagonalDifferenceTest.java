import org.junit.jupiter.api.Test;

import static support.Console.check;

class DiagonalDifferenceTest {
    @Test
    void absoluteDifference() throws Exception {
        check("15", () -> DiagonalDifference.main(new String[0]), "3\n11 2 4\n4 5 6\n10 8 -12\n");
    }
}
