package CustomListSorter;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    @Test
    void sortsInNaturalOrder() throws Exception {
        check("false\naa\nbb\ncc", () -> Main.main(new String[0]), "Add cc\nAdd bb\nAdd aa\nSort\nContains dd\nPrint\nEND\n");
    }
}
