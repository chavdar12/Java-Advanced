import org.junit.jupiter.api.Test;

import static support.Console.check;

class ReverseAndExcludeTest {
    @Test
    void reversesAndDropsDivisible() throws Exception {
        check("5 3 1", () -> ReverseAndExclude.main(new String[0]), "1 2 3 4 5 6\n2\n");
        check("50 40 10 20", () -> ReverseAndExclude.main(new String[0]), "20 10 40 30 60 50\n3\n");
    }
}
