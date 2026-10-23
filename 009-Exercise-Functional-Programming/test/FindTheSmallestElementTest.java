import org.junit.jupiter.api.Test;

import static support.Console.check;

class FindTheSmallestElementTest {
    @Test
    void printsIndex() throws Exception {
        check("3", () -> FindTheSmallestElement.main(new String[0]), "1 2 3 0 4 5 6\n");
    }

    @Test
    void rightmostOnTie() throws Exception {
        check("3", () -> FindTheSmallestElement.main(new String[0]), "1 0 5 0 2\n");
    }
}
