import org.junit.jupiter.api.Test;

import static support.Console.check;

class SetsOfElementsTest {
    @Test
    void printsCommonElementsInFirstSetOrder() throws Exception {
        check("5 1 3", () -> SetsOfElements.main(new String[0]), "3 3\n5\n1\n3\n3\n1\n5\n");
    }

    @Test
    void skipsMissing() throws Exception {
        check("3 5", () -> SetsOfElements.main(new String[0]), "4 3\n1\n3\n5\n7\n3\n4\n5\n");
    }
}
