import org.junit.jupiter.api.Test;

import static support.Console.check;

class BasicStackOperationsTest {
    @Test
    void findsElementAfterPopping() throws Exception {
        check("true", () -> BasicStackOperations.main(new String[0]), "5 2 13\n1 13 45 32 4\n");
    }

    @Test
    void printsMinimumWhenMissing() throws Exception {
        check("13", () -> BasicStackOperations.main(new String[0]), "4 1 666\n420 69 13 666\n");
    }

    @Test
    void printsZeroWhenEmpty() throws Exception {
        check("0", () -> BasicStackOperations.main(new String[0]), "2 2 1\n1 2\n");
    }
}
