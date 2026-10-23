import org.junit.jupiter.api.Test;

import static support.Console.check;

class ParkingSystemTest {
    @Test
    void parksInNearestFreeSpot() throws Exception {
        check("""
                4
                2
                4
                Row 2 full
                """, () -> ParkingSystem.main(new String[0]), "4 4\n1 2 2\n2 2 2\n2 2 2\n3 2 2\nstop\n");
    }
}
