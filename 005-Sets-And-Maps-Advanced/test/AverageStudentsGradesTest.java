import org.junit.jupiter.api.Test;

import static support.Console.check;

class AverageStudentsGradesTest {
    @Test
    void groupsGradesPerStudent() throws Exception {
        check("""
                Ivancho -> 5.20 3.20 (avg: 4.20)
                Mariika -> 5.50 2.50 3.46 (avg: 3.82)
                Stamat -> 2.00 3.00 (avg: 2.50)
                """, () -> AverageStudentsGrades.main(new String[0]), """
                7
                Ivancho 5.20
                Mariika 5.50
                Ivancho 3.20
                Mariika 2.50
                Stamat 2.00
                Mariika 3.46
                Stamat 3.00
                """);
    }
}
