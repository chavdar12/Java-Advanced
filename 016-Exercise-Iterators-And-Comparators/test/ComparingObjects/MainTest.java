package ComparingObjects;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    @Test
    void noMatches() throws Exception {
        check("No matches", () -> Main.main(new String[0]), "Peter 22 Varna\nGeorge 14 Sofia\nEND\n2\n");
    }

    @Test
    void countsEqualPeople() throws Exception {
        check("2 1 3", () -> Main.main(new String[0]), "Peter 22 Varna\nGeorge 22 Varna\nPeter 22 Varna\nEND\n1\n");
    }
}
