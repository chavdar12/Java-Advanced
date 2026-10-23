import org.junit.jupiter.api.Test;

import static support.Console.check;

class StringMatrixRotationTest {
    private static final String WORDS = "hello\nsoftuni\nexam\nEND\n";

    @Test
    void rotate90() throws Exception {
        check("""
                esh
                xoe
                afl
                mtl
                 uo
                 n
                 i
                """, () -> StringMatrixRotation.main(new String[0]), "Rotate(90)\n" + WORDS);
    }

    @Test
    void rotate180() throws Exception {
        check("""
                   maxe
                inutfos
                  olleh
                """, () -> StringMatrixRotation.main(new String[0]), "Rotate(180)\n" + WORDS);
    }

    @Test
    void rotate270() throws Exception {
        check("""
                 i
                 n
                ou
                ltm
                lfa
                eox
                hse
                """, () -> StringMatrixRotation.main(new String[0]), "Rotate(270)\n" + WORDS);
    }

    @Test
    void fullTurnsLeaveTextUnchanged() throws Exception {
        check("hello\nsoftuni\nexam", () -> StringMatrixRotation.main(new String[0]), "Rotate(720)\n" + WORDS);
    }
}
