import org.junit.jupiter.api.Test;

import static support.Console.check;

class PeriodicTableTest {
    @Test
    void uniqueElementsSorted() throws Exception {
        check("Ce Ee Mo O", () -> PeriodicTable.main(new String[0]), "4\nCe O\nMo O Ce\nEe\nMo\n");
    }
}
