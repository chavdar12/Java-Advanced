import org.junit.jupiter.api.Test;

import static support.Console.check;

class WrongMeasurementsTest {
    @Test
    void replacesWrongValuesUsingOriginalNeighbours() throws Exception {
        check("""
                1 2 2
                16 6 14
                9 23 8
                """, () -> WrongMeasurements.main(new String[0]), "3\n3\n1 2 4\n4 6 4\n9 4 8\n0 2\n");
    }
}
