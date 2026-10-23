import org.junit.jupiter.api.Test;

import static support.Console.check;

class DecimalToBinaryConverterTest {
    @Test
    void convertsToBinary() throws Exception {
        check("1010", () -> DecimalToBinaryConverter.main(new String[0]), "10\n");
    }

    @Test
    void zeroIsZero() throws Exception {
        check("0", () -> DecimalToBinaryConverter.main(new String[0]), "0\n");
    }
}
