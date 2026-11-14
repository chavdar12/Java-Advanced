import org.junit.jupiter.api.Test;

import static support.Console.check;

class WarNumberGameTest {
    @Test
    void winnerTakesBothCards() throws Exception {
        check("First player wins! Sum: 14", () -> WarNumberGame.main(new String[0]), "5 4\n3 2\n");
    }

    @Test
    void secondPlayerWins() throws Exception {
        check("Second player wins! Sum: 10", () -> WarNumberGame.main(new String[0]), "1\n9\n");
    }
}
