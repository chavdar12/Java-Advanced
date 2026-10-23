package GenericScale;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static support.Console.check;

class ScaleTest {
    @Test
    void returnsHeavierSide() {
        assertEquals(2, new Scale<>(1, 2).getHeavier());
        assertEquals("b", new Scale<>("b", "a").getHeavier());
    }

    @Test
    void equalSidesReturnNull() {
        assertNull(new Scale<>(3, 3).getHeavier());
    }

    @Test
    void main() throws Exception {
        check("2", () -> Main.main(new String[0]), "");
    }
}
