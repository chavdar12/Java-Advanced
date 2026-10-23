import org.junit.jupiter.api.Test;

import static support.Console.check;

class SerbianUnleashedTest {
    @Test
    void sumsMoneyPerVenueAndSinger() throws Exception {
        check("""
                Sunny Beach
                #  Ceca -> 385000
                #  Mile Kitic -> 105000
                #  Lepa Brena -> 87500
                #  Dragana -> 80500
                Belgrade
                #  Ceca -> 12
                """, () -> SerbianUnleashed.main(new String[0]), """
                Lepa Brena @Sunny Beach 25 3500
                Dragana @Sunny Beach 23 3500
                Ceca @Sunny Beach 28 5000
                Mile Kitic @Sunny Beach 21 5000
                Ceca @Sunny Beach 35 3500
                Ceca @Sunny Beach 35 3500
                Dragana@Belgrade 23 3500
                Ceca @Belgrade 4 3
                End
                """);
    }
}
