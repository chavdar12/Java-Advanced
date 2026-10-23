import org.junit.jupiter.api.Test;

import static support.Console.check;

class BasicQueueOperationsTest {
    @Test
    void findsElementAfterPolling() throws Exception {
        check("true", () -> BasicQueueOperations.main(new String[0]), "5 2 32\n1 13 45 32 4\n");
    }

    @Test
    void printsMinimumWhenMissing() throws Exception {
        check("13", () -> BasicQueueOperations.main(new String[0]), "4 1 666\n666 69 13 420\n");
    }

    @Test
    void printsZeroWhenEmpty() throws Exception {
        check("0", () -> BasicQueueOperations.main(new String[0]), "3 3 1\n1 2 3\n");
    }
}
