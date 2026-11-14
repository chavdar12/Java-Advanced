import org.junit.jupiter.api.Test;

import static support.Console.check;

class HandsOfCardsTest {
    @Test
    void sumsUniqueCardsPerPlayer() throws Exception {
        check("Peter: 167\nTomas: 175\nAndrea: 197", () -> HandsOfCards.main(new String[0]), """
                Peter: 2C, 4H, 9H, AS, QS
                Tomas: 3H, 10S, JC, KD, 5S, 10S
                Andrea: QH, QC, QS, QD
                Tomas: 6H, 7S, KC, KD, 5S, 10C
                Andrea: QH, QC, JS, JD, JC
                Peter: JD, JD, JD, JD, JD, JD
                JOKER
                """);
    }
}
