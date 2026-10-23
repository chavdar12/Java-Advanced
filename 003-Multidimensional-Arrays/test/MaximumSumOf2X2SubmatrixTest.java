import org.junit.jupiter.api.Test;

import static support.Console.check;

class MaximumSumOf2X2SubmatrixTest {
    @Test
    void findsBest2x2() throws Exception {
        check("9 8\n7 9\n33", () -> MaximumSumOf2X2Submatrix.main(new String[0]),
                "3, 6\n7, 1, 3, 3, 2, 1\n1, 3, 9, 8, 5, 6\n4, 6, 7, 9, 1, 0\n");
    }
}
