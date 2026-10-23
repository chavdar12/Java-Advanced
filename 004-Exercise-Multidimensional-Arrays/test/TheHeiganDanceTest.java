import org.junit.jupiter.api.Test;

import static support.Console.check;

class TheHeiganDanceTest {
    @Test
    void playerKilledByEruption() throws Exception {
        check("""
                Heigan: 2960000.00
                Player: Killed by Eruption
                Final position: 8, 7
                """, () -> TheHeiganDance.main(new String[0]), "10000\nCloud 7 7\nEruption 6 7\nEruption 8 7\nEruption 8 7\n");
    }

    @Test
    void heiganStillTakesDamageOnTheTurnTheCloudKills() throws Exception {
        check("""
                Heigan: 2600000.00
                Player: Killed by Plague Cloud
                Final position: 7, 7
                """, () -> TheHeiganDance.main(new String[0]), "100000\nEruption 7 7\nEruption 7 7\nCloud 7 7\n");
    }

    @Test
    void heiganDefeated() throws Exception {
        check("""
                Heigan: Defeated!
                Player: 18500
                Final position: 7, 7
                """, () -> TheHeiganDance.main(new String[0]), "1500000\nCloud 0 0\n");
    }
}
