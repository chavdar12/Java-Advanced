import org.junit.jupiter.api.Test;

import static support.Console.check;

class SumMatrixElementsTest {
    @Test
    void printsSizeAndSum() throws Exception {
        check("3\n6\n76", () -> SumMatrixElements.main(new String[0]),
                "3, 6\n7, 1, 3, 3, 2, 1\n1, 3, 9, 8, 5, 6\n4, 6, 7, 9, 1, 0\n");
    }
}
