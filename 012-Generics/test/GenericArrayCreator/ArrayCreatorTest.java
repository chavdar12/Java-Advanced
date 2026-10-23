package GenericArrayCreator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static support.Console.check;

class ArrayCreatorTest {
    @Test
    void createsArrayOfItemType() {
        String[] strings = ArrayCreator.create(3, "none");
        assertArrayEquals(new String[]{"none", "none", "none"}, strings);
        assertEquals(String[].class, strings.getClass());
    }

    @Test
    void createsArrayOfGivenClass() {
        Number[] numbers = ArrayCreator.create(Number.class, 2, 5);
        assertEquals(Number[].class, numbers.getClass());
        assertArrayEquals(new Number[]{5, 5}, numbers);
    }

    @Test
    void main() throws Exception {
        check("[none, none, none, none, none, none, none, none, none, none]\n[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]",
                () -> Main.main(new String[0]), "");
    }
}
