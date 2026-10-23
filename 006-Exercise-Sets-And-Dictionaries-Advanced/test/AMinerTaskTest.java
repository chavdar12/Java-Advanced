import org.junit.jupiter.api.Test;

import static support.Console.check;

class AMinerTaskTest {
    @Test
    void sumsQuantitiesPerResource() throws Exception {
        check("Gold -> 170\nSilver -> 10\nCopper -> 17", () -> AMinerTask.main(new String[0]),
                "Gold\n155\nSilver\n10\nCopper\n17\nGold\n15\nstop\n");
    }
}
