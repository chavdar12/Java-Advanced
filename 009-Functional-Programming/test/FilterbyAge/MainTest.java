package FilterByAge;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    private static final String PEOPLE = "5\nPeter, 20\nGeorge, 18\nReag, 33\nSimon, 22\nKiril, 25\n";

    @Test
    void olderPrintsNameAndAge() throws Exception {
        check("Peter - 20\nReag - 33\nSimon - 22\nKiril - 25", () -> Main.main(new String[0]), PEOPLE + "older\n20\nname age\n");
    }

    @Test
    void youngerPrintsNames() throws Exception {
        check("Peter\nGeorge", () -> Main.main(new String[0]), PEOPLE + "younger\n20\nname\n");
    }

    @Test
    void agesOnly() throws Exception {
        check("33", () -> Main.main(new String[0]), PEOPLE + "older\n30\nage\n");
    }
}
