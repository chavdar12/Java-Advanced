import org.junit.jupiter.api.Test;

import static support.Console.check;

class SumNumbersTest {
    @Test
    void countAndSum() throws Exception {
        check("Count = 6\nSum = 98", () -> SumNumbers.main(new String[0]), "4, 2, 1, 3, 76, 12\n");
    }
}
