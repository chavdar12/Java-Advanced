import org.junit.jupiter.api.Test;

import static support.Console.check;

class IntersectionOfTwoMatricesTest {
    @Test
    void marksDifferencesWithStar() throws Exception {
        check("""
                * b c *
                a b * d
                a * c d
                """, () -> IntersectionOfTwoMatrices.main(new String[0]), """
                3
                4
                a b c d
                a b c d
                a b c d
                k b c k
                a b g d
                a k c d
                """);
    }
}
