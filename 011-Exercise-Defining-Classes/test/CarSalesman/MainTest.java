package CarSalesman;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    // Main keeps its reader and collections in static fields, so there is one scenario per JVM
    @Test
    void printsCarsWithOptionalFields() throws Exception {
        check("""
                FordFocus:
                V4-33:
                Power: 140
                Displacement: 28
                Efficiency: B
                Weight: 1300
                Color: Silver
                FordMustang:
                V8-101:
                Power: 220
                Displacement: 50
                Efficiency: n/a
                Weight: n/a
                Color: n/a
                VolkswagenGolf:
                V4-33:
                Power: 140
                Displacement: 28
                Efficiency: B
                Weight: n/a
                Color: Orange
                """, () -> Main.main(new String[0]), """
                2
                V8-101 220 50
                V4-33 140 28 B
                3
                FordFocus V4-33 1300 Silver
                FordMustang V8-101
                VolkswagenGolf V4-33 Orange
                """);
    }
}
