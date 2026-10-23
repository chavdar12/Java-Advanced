import org.junit.jupiter.api.Test;

import static support.Console.check;

class CountUppercaseWordsTest {
    @Test
    void countsThenPrints() throws Exception {
        check("2\nThe\nFunction", () -> CountUppercaseWords.main(new String[0]), "The following example shows how to use Function\n");
    }
}
