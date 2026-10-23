import org.junit.jupiter.api.Test;

import static support.Console.check;

class RadioactiveMutantVampireBunniesTest {
    @Test
    void playerEscapes() throws Exception {
        check("""
                ......
                ...B..
                ..BBB.
                ...B..
                ......
                won: 0 5
                """, () -> RadioactiveMutantVampireBunnies.main(new String[0]), """
                5 6
                .....P
                ......
                ...B..
                ......
                ......
                ULDDDR
                """);
    }

    @Test
    void playerWalksIntoBunny() throws Exception {
        check("""
                .B...
                BBB..
                BBBB.
                BBB..
                dead: 3 1
                """, () -> RadioactiveMutantVampireBunnies.main(new String[0]), """
                4 5
                .....
                .....
                .B...
                ...P.
                LLLLLLLL
                """);
    }
}
