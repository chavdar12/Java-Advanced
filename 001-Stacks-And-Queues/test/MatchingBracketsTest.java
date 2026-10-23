import org.junit.jupiter.api.Test;

import static support.Console.check;

class MatchingBracketsTest {
    @Test
    void printsSubExpressionsInClosingOrder() throws Exception {
        check("""
                (2 + 3)
                (3 + 1)
                (2 - (2 + 3) * 4 / (3 + 1))
                """, () -> MatchingBrackets.main(new String[0]), "1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5\n");
    }
}
