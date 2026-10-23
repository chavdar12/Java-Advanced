import org.junit.jupiter.api.Test;

import static support.Console.check;

class CountSymbolsTest {
    @Test
    void countsInAlphabeticalOrder() throws Exception {
        check("""
                 : 1 time/s
                S: 1 time/s
                U: 1 time/s
                c: 1 time/s
                f: 1 time/s
                i: 1 time/s
                k: 1 time/s
                n: 1 time/s
                o: 2 time/s
                r: 1 time/s
                s: 1 time/s
                t: 1 time/s
                """, () -> CountSymbols.main(new String[0]), "SoftUni rocks\n");
    }
}
