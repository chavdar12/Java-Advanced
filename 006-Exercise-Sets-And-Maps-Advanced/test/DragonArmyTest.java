import org.junit.jupiter.api.Test;

import static support.Console.check;

class DragonArmyTest {
    @Test
    void typesInInputOrderDragonsByName() throws Exception {
        check("""
                Red::(160.00/2350.00/30.00)
                -Bazgargal -> damage: 100, health: 2500, armor: 25
                -Obsidion -> damage: 220, health: 2200, armor: 35
                Black::(200.00/3500.00/18.00)
                -Dargonax -> damage: 200, health: 3500, armor: 18
                Blue::(62.50/1950.00/35.00)
                -Algordox -> damage: 65, health: 1800, armor: 50
                -Kerizsa -> damage: 60, health: 2100, armor: 20
                """, () -> DragonArmy.main(new String[0]), """
                5
                Red Bazgargal 100 2500 25
                Black Dargonax 200 3500 18
                Red Obsidion 220 2200 35
                Blue Kerizsa 60 2100 20
                Blue Algordox 65 1800 50
                """);
    }

    @Test
    void nullStatsUseDefaultsAndDuplicatesOverwrite() throws Exception {
        check("""
                Green::(45.00/250.00/10.00)
                -Viper -> damage: 45, health: 250, armor: 10
                """, () -> DragonArmy.main(new String[0]), "2\nGreen Viper 1 1 1\nGreen Viper null null null\n");
    }
}
