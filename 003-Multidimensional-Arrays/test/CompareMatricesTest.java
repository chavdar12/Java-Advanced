import org.junit.jupiter.api.Test;

import static support.Console.check;

class CompareMatricesTest {
    @Test
    void equalMatrices() throws Exception {
        check("equal", () -> CompareMatrices.main(new String[0]), "2 3\n1 2 3\n2 1 3\n2 3\n1 2 3\n2 1 3\n");
    }

    @Test
    void differentValues() throws Exception {
        check("not equal", () -> CompareMatrices.main(new String[0]), "2 2\n1 2\n3 4\n2 2\n1 2\n4 3\n");
    }

    @Test
    void differentDimensions() throws Exception {
        check("not equal", () -> CompareMatrices.main(new String[0]), "1 2\n1 2\n2 1\n1\n2\n");
    }
}
