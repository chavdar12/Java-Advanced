import org.junit.jupiter.api.Test;

import static support.Console.check;

class ReverseNumbersWithAStackTest {
    @Test
    void reverses() throws Exception {
        check("5 4 3 2 1", () -> ReverseNumbersWithAStack.main(new String[0]), "1 2 3 4 5\n");
    }
}
