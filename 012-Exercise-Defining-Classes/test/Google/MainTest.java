package Google;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    // Main keeps its reader and collections in static fields, so there is one scenario per JVM
    @Test
    void printsPersonProfile() throws Exception {
        check("""
                TonchoTonchev
                Company:
                Car:
                Trabant 30
                Pokemon:
                Electrode Electricity
                Parents:
                Children:
                """, () -> Main.main(new String[0]), """
                PeshoPeshev company PeshInc Management 1000.00
                TonchoTonchev car Trabant 30
                PeshoPeshev pokemon Pikachu Electricity
                PeshoPeshev parents PoshoPeshev 22/02/1920
                TonchoTonchev pokemon Electrode Electricity
                End
                TonchoTonchev
                """);
    }
}
