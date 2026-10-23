import org.junit.jupiter.api.Test;

import static support.Console.check;

class PrintDiagonalsOfSquareMatrixTest {
    @Test
    void printsBothDiagonals() throws Exception {
        check("1 5 9\n7 5 3", () -> PrintDiagonalsOfSquareMatrix.main(new String[0]), "3\n1 2 3\n4 5 6\n7 8 9\n");
    }
}
