import org.junit.jupiter.api.Test;

import static support.Console.check;

class ReverseMatrixDiagonalsTest {
    @Test
    void printsDiagonalsFromBottomRight() throws Exception {
        check("""
                10
                11 12
                13 14 15
                16 17 18
                19 20
                21
                """, () -> ReverseMatrixDiagonals.main(new String[0]), "3 4\n21 20 18 15\n19 17 14 12\n16 13 11 10\n");
    }
}
