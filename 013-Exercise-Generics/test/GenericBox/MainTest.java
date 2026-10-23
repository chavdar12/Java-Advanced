package GenericBox;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    @Test
    void printsTypeAndValue() throws Exception {
        check("java.lang.String: life in a box\njava.lang.String: s", () -> Main.main(new String[0]), "2\nlife in a box\ns\n");
    }
}
