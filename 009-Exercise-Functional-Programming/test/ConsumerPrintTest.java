import org.junit.jupiter.api.Test;

import static support.Console.check;

class ConsumerPrintTest {
    @Test
    void printsEachName() throws Exception {
        check("Peter\nGeorge\nAlex", () -> ConsumerPrint.main(new String[0]), "Peter George Alex\n");
    }
}
