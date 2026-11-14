package CarInfo;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    @Test
    void printsEveryCar() throws Exception {
        check("""
                The car is: Chevrolet Impala - 390 HP.
                The car is: Mercedes Benz - 500 HP.
                """, () -> Main.main(new String[0]), "2\nChevrolet Impala 390\nMercedes Benz 500\n");
    }
}
