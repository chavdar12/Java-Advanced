package Froggy;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    @Test
    void evenIndexesThenOdd() throws Exception {
        check("1, 3, 5, 7, 2, 4, 6, 8", () -> Main.main(new String[0]), "1, 2, 3, 4, 5, 6, 7, 8\nEND\n");
        check("1, 3, 2", () -> Main.main(new String[0]), "1, 2, 3\nEND\n");
        check("5", () -> Main.main(new String[0]), "5\nEND\n");
    }
}
