import org.junit.jupiter.api.Test;

import static support.Console.check;

class MathPotatoTest {
    @Test
    void primeCyclesKeepTheKid() throws Exception {
        check("""
                Removed Pepi
                Prime Mimi
                Prime Toshko
                Removed Mimi
                Last is Toshko
                """, () -> MathPotato.main(new String[0]), "Mimi Pepi Toshko\n2\n");
    }
}
