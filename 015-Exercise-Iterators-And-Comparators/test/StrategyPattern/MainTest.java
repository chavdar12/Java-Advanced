package StrategyPattern;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    @Test
    void sortsByNameRuleThenAge() throws Exception {
        check("""
                Pan 15
                Peter 20
                George 100
                Pan 15
                Peter 20
                George 100
                """, () -> Main.main(new String[0]), "3\nPeter 20\nGeorge 100\nPan 15\n");
    }

    @Test
    void sameLengthOrdersByFirstLetterIgnoringCase() throws Exception {
        check("asen 30\nBoby 20\nBoby 20\nasen 30", () -> Main.main(new String[0]), "2\nBoby 20\nasen 30\n");
    }
}
