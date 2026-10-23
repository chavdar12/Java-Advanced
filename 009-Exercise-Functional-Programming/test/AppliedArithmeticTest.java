import org.junit.jupiter.api.Test;

import static support.Console.check;

class AppliedArithmeticTest {
    @Test
    void appliesCommands() throws Exception {
        check("3 4 5 6 7", () -> AppliedArithmetic.main(new String[0]), "1 2 3 4 5\nadd\nadd\nprint\nend\n");
        check("9 19", () -> AppliedArithmetic.main(new String[0]), "5 10\nmultiply\nsubtract\nprint\nend\n");
    }
}
