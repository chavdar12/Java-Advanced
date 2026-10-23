package CatLady;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    @Test
    void printsRequestedCat() throws Exception {
        check("Cymric Tom 31.00", () -> Main.main(new String[0]),
                "StreetExtraordinaire Maca 85\nSiamese Sim 4\nCymric Tom 31\nEnd\nTom\n");
    }

    @Test
    void streetCatDecibels() throws Exception {
        check("StreetExtraordinaire Maca 85.50", () -> Main.main(new String[0]), "StreetExtraordinaire Maca 85.5\nEnd\nMaca\n");
    }
}
