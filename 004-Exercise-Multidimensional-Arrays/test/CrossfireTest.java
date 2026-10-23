import org.junit.jupiter.api.Test;

import static support.Console.check;

class CrossfireTest {
    @Test
    void rowsCollapseAfterEachShot() throws Exception {
        check("""
                1 2 3 4 5
                6 7 8 10
                11 12 13
                16
                21
                """, () -> Crossfire.main(new String[0]), "5 5\n3 3 2\n4 3 2\nNuke it from orbit\n");
    }

    @Test
    void outOfBoundsShotsAreIgnored() throws Exception {
        check("""
                2 3
                6
                8 9
                """, () -> Crossfire.main(new String[0]), "3 3\n1 0 1\n10 10 1\nNuke it from orbit\n");
    }

    @Test
    void emptyRowsDisappear() throws Exception {
        check("4", () -> Crossfire.main(new String[0]), "2 2\n0 0 1\nNuke it from orbit\n");
    }
}
