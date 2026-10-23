package ListyIterator;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    @Test
    void movesAndPrints() throws Exception {
        check("true\nStefcho\ntrue\nGoshky\nfalse", () -> Main.main(new String[0]),
                "Create Stefcho Goshky\nHasNext\nPrint\nMove\nPrint\nMove\nEND\n");
    }

    @Test
    void printOnEmptyIsInvalid() throws Exception {
        check("Invalid Operation!", () -> Main.main(new String[0]), "Create\nPrint\nEND\n");
    }
}
