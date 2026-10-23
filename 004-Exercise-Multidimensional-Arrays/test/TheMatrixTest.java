import org.junit.jupiter.api.Test;

import static support.Console.check;

class TheMatrixTest {
    @Test
    void floodFillsConnectedRegion() throws Exception {
        check("""
                xxx
                x*x
                x*x
                x*x
                x*x
                """, () -> TheMatrix.main(new String[0]), "5 3\n. . .\n. * .\n. * .\n. * .\n. * .\nx 0 0\n");
    }
}
