import org.junit.jupiter.api.Test;

import static support.Console.check;

class HotPotatoTest {
    @Test
    void removesEveryNthKid() throws Exception {
        check("""
                Removed Pepi
                Removed Mimi
                Last is Toshko
                """, () -> HotPotato.main(new String[0]), "Mimi Pepi Toshko\n2\n");
    }
}
