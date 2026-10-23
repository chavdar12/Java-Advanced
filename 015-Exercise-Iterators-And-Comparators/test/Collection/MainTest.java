package Collection;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    @Test
    void iteratesAndPrintsAll() throws Exception {
        check("Stefcho Goshky Peshu\ntrue\nGoshky\ntrue\ntrue\nfalse\nPeshu", () -> Main.main(new String[0]),
                "Create Stefcho Goshky Peshu\nPrintAll\nMove\nPrint\nHasNext\nMove\nMove\nPrint\nEND\n");
    }

    @Test
    void emptyCollection() throws Exception {
        check("Invalid Operation!\nInvalid Operation!\nfalse\nfalse", () -> Main.main(new String[0]),
                "Create\nPrint\nPrintAll\nMove\nHasNext\nEND\n");
    }
}
