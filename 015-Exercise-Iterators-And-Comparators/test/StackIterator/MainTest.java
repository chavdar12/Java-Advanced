package StackIterator;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    @Test
    void popsAndIteratesTwice() throws Exception {
        check("2\n1\n2\n1", () -> Main.main(new String[0]), "Push 1, 2, 3, 4\nPop\nPop\nEND\n");
    }

    @Test
    void popOnEmpty() throws Exception {
        check("No elements", () -> Main.main(new String[0]), "Pop\nEND\n");
    }
}
