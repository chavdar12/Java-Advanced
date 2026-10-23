import org.junit.jupiter.api.Test;

import static support.Console.check;

class KnightsOfHonorTest {
    @Test
    void prefixesSir() throws Exception {
        check("Sir Peter\nSir Vasil\nSir George", () -> KnightsOfHonor.main(new String[0]), "Peter Vasil George\n");
    }
}
