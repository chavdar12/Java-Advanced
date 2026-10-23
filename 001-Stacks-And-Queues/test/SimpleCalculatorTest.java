import org.junit.jupiter.api.Test;

import static support.Console.check;

class SimpleCalculatorTest {
    @Test
    void evaluatesLeftToRight() throws Exception {
        check("14", () -> SimpleCalculator.main(new String[0]), "2 + 5 + 10 - 2 - 1\n");
    }
}
