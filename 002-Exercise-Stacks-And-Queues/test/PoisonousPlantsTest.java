import org.junit.jupiter.api.Test;

import static support.Console.check;

class PoisonousPlantsTest {
    @Test
    void sampleTakesTwoDays() throws Exception {
        check("2", () -> PoisonousPlants.main(new String[0]), "7\n6 5 8 4 7 10 9\n");
    }

    @Test
    void decreasingPlantsNeverDie() throws Exception {
        check("0", () -> PoisonousPlants.main(new String[0]), "3\n3 2 1\n");
    }

    @Test
    void increasingPlantsAllDieOnDayOne() throws Exception {
        check("1", () -> PoisonousPlants.main(new String[0]), "5\n1 2 3 4 5\n");
    }

    @Test
    void chainOfDeaths() throws Exception {
        // day 1 kills 7, then 5 is next to 4 and dies on day 2
        check("2", () -> PoisonousPlants.main(new String[0]), "3\n4 7 5\n");
    }
}
