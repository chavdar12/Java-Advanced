import org.junit.jupiter.api.Test;

import static support.Console.check;

class FillTheMatrixTest {
    @Test
    void patternA() throws Exception {
        check("1 4 7\n2 5 8\n3 6 9", () -> FillTheMatrix.main(new String[0]), "3, A\n");
    }

    @Test
    void patternB() throws Exception {
        check("1 6 7\n2 5 8\n3 4 9", () -> FillTheMatrix.main(new String[0]), "3, B\n");
    }
}
