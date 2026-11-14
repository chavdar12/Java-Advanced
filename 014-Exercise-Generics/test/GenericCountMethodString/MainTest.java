package GenericCountMethodString;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    @Test
    void countsGreaterStrings() throws Exception {
        check("2", () -> Main.main(new String[0]), "3\naa\naaa\nbb\naa\n");
    }
}
