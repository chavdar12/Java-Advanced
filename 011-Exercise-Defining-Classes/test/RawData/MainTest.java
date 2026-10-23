package RawData;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    // Main keeps its reader and collections in static fields, so there is one scenario per JVM
    @Test
    void fragileCarsWithLowTirePressure() throws Exception {
        check("Citroen2CV", () -> Main.main(new String[0]), """
                2
                ChevroletAstro 200 180 1000 fragile 1.3 1 1.5 2 1.4 2 1.7 4
                Citroen2CV 190 165 1200 fragile 0.9 3 0.85 2 0.95 2 1.1 1
                fragile
                """);
    }
}
