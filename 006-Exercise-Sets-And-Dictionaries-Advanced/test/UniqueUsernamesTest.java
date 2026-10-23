import org.junit.jupiter.api.Test;

import static support.Console.check;

class UniqueUsernamesTest {
    @Test
    void keepsFirstOccurrence() throws Exception {
        check("Ivan\nSofia\nStanislav", () -> UniqueUsernames.main(new String[0]), "6\nIvan\nIvan\nIvan\nSofia\nStanislav\nSofia\n");
    }
}
