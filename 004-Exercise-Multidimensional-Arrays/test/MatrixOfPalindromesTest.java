import org.junit.jupiter.api.Test;

import static support.Console.check;

class MatrixOfPalindromesTest {
    @Test
    void buildsPalindromes() throws Exception {
        check("""
                aaa aba aca ada aea afa
                bbb bcb bdb beb bfb bgb
                ccc cdc cec cfc cgc chc
                ddd ded dfd dgd dhd did
                """, () -> MatrixOfPalindromes.main(new String[0]), "4 6\n");
    }
}
