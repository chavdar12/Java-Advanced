package CustomList;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    @Test
    void supportsAllCommands() throws Exception {
        check("cc\naa\n2\ntrue\ncc\nbb\naa", () -> Main.main(new String[0]),
                "Add aa\nAdd bb\nAdd cc\nMax\nMin\nGreater aa\nSwap 0 2\nContains aa\nPrint\nEND\n");
    }

    @Test
    void printingAnEmptyListDoesNotCrash() throws Exception {
        check("", () -> Main.main(new String[0]), "Add a\nRemove 0\nPrint\nEND\n");
    }
}
