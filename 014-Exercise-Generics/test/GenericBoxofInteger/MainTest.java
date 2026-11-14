package GenericBoxOfInteger;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    @Test
    void storesIntegers() throws Exception {
        check("java.lang.Integer: 7\njava.lang.Integer: 123\njava.lang.Integer: 42", () -> Main.main(new String[0]), "3\n7\n123\n42\n");
    }
}
