import org.junit.jupiter.api.Test;

import static support.Console.check;

class MaximalSumTest {
    @Test
    void findsBest3x3() throws Exception {
        check("""
                Sum = 75
                1 4 14
                7 11 2
                8 12 16
                """, () -> MaximalSum.main(new String[0]), "4 5\n1 5 5 2 4\n2 1 4 14 3\n3 7 11 2 8\n4 8 12 16 4\n");
    }
}
