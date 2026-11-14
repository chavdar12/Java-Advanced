import org.junit.jupiter.api.Test;

import static support.Console.check;

class PredicatePartyTest {
    @Test
    void removeAndDouble() throws Exception {
        check("Misha, Misha, Stefan are going to the party!", () -> PredicateParty.main(new String[0]),
                "Peter Misha Stefan\nRemove StartsWith P\nDouble Length 5\nParty!\n");
    }

    @Test
    void doublingTwiceQuadruples() throws Exception {
        check("Peter, Peter, Peter, Peter are going to the party!", () -> PredicateParty.main(new String[0]),
                "Peter\nDouble StartsWith Pete\nDouble EndsWith eter\nParty!\n");
    }

    @Test
    void nobodyLeft() throws Exception {
        check("Nobody is going to the party!", () -> PredicateParty.main(new String[0]), "Peter\nRemove EndsWith r\nParty!\n");
    }
}
