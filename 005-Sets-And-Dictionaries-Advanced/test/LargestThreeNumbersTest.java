import org.junit.jupiter.api.Test;

import static support.Console.check;

class LargestThreeNumbersTest {
    @Test
    void printsTopThree() throws Exception {
        check("50 30 20", () -> LargestThreeNumbers.main(new String[0]), "10 30 15 20 50 5\n");
    }

    @Test
    void printsAllWhenFewerThanThree() throws Exception {
        check("30 20", () -> LargestThreeNumbers.main(new String[0]), "20 30\n");
    }
}
