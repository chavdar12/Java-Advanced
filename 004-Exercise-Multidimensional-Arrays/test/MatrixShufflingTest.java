import org.junit.jupiter.api.Test;

import static support.Console.check;

class MatrixShufflingTest {
    @Test
    void swapsAndRejectsInvalidCommands() throws Exception {
        check("""
                5 2 3
                4 1 6
                Invalid input!
                Invalid input!
                5 4 3
                2 1 6
                """, () -> MatrixShuffling.main(new String[0]), """
                2 3
                1 2 3
                4 5 6
                swap 0 0 1 1
                swap 10 9 8 7
                swp 0 1 1 0
                swap 0 1 1 0
                END
                """);
    }
}
