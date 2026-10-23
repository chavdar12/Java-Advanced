package SpeedRacing;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    @Test
    void drivesCars() throws Exception {
        check("AudiA4 17.60 18\nBMW-M2 21.48 56", () -> Main.main(new String[0]), """
                2
                AudiA4 23 0.3
                BMW-M2 45 0.42
                Drive BMW-M2 56
                Drive AudiA4 5
                Drive AudiA4 13
                End
                """);
    }

    @Test
    void insufficientFuel() throws Exception {
        check("Insufficient fuel for the drive\nAudi 1.00 0", () -> Main.main(new String[0]), "1\nAudi 1 1\nDrive Audi 5\nEnd\n");
    }
}
