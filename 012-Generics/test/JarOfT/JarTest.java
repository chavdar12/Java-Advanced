package JarOfT;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static support.Console.check;

class JarTest {
    @Test
    void removesLastAdded() {
        Jar<Integer> jar = new Jar<>();
        jar.add(1);
        jar.add(2);
        assertEquals(2, jar.remove());
        assertEquals(1, jar.remove());
    }

    @Test
    void emptyJarThrows() {
        assertThrows(NoSuchElementException.class, () -> new Jar<String>().remove());
    }

    @Test
    void main() throws Exception {
        check("Stamat", () -> Main.main(new String[0]), "");
    }
}
