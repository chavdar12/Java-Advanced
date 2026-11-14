package GenericSwapMethodString;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    @Test
    void swapsTwoElements() throws Exception {
        check("java.lang.String: Pesho\njava.lang.String: Swap me with Pesho\njava.lang.String: Gosho", () -> Main.main(new String[0]),
                "3\nSwap me with Pesho\nPesho\nGosho\n0 1\n");
    }
}
