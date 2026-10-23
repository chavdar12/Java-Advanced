import org.junit.jupiter.api.Test;

import static support.Console.check;

class RecursiveFibonacciTest {
    @Test
    void fibonacci() throws Exception {
        check("8", () -> RecursiveFibonacci.main(new String[0]), "5\n");
        check("17711", () -> RecursiveFibonacci.main(new String[0]), "21\n");
        check("1", () -> RecursiveFibonacci.main(new String[0]), "0\n");
    }
}
