import org.junit.jupiter.api.Test;

import static support.Console.check;

class LegendaryFarmingTest {
    @Test
    void obtainsItemAndSortsLeftovers() throws Exception {
        check("""
                Valanyr obtained!
                fragments: 5
                shards: 5
                motes: 3
                leathers: 6
                stones: 5
                """, () -> LegendaryFarming.main(new String[0]), "3 Motes 5 stones 5 Shards\n6 leathers 255 fragments 7 Shards\n");
    }
}
