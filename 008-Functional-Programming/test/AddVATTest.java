import org.junit.jupiter.api.Test;

import static support.Console.check;

class AddVATTest {
    @Test
    void addsTwentyPercent() throws Exception {
        check("Prices with VAT:\n1.61\n3.07\n4.80\n7.20", () -> AddVAT.main(new String[0]), "1.34, 2.56, 4, 6\n");
    }
}
