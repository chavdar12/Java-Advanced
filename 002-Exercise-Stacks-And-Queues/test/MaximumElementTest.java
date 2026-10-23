import org.junit.jupiter.api.Test;

import static support.Console.check;

class MaximumElementTest {
    @Test
    void tracksMaximum() throws Exception {
        check("26\n91", () -> MaximumElement.main(new String[0]), "9\n1 97\n2\n1 20\n2\n1 26\n1 20\n3\n1 91\n3\n");
    }
}
