import org.junit.jupiter.api.Test;

import static support.Console.check;

class FindTheRealQueenTest {
    @Test
    void findsTheQueenNobodyAttacks() throws Exception {
        check("5 2", () -> FindTheRealQueen.main(new String[0]), """
                q p p p p q p p
                p p p p p p p p
                p p p p p p p p
                p p p p p p p p
                p p p p p p p p
                p p q p p p p p
                p p p p p p p p
                p p p p p p p p
                """);
    }
}
