import org.junit.jupiter.api.Test;

import static support.Console.check;

class SoftUniPartyTest {
    @Test
    void vipGuestsFirst() throws Exception {
        check("2\n7IK9Yo0h\ntSzE5t0p", () -> SoftUniParty.main(new String[0]), """
                7IK9Yo0h
                9NoBUajQ
                Ce8vwPmE
                SVQXQCbc
                tSzE5t0p
                PARTY
                9NoBUajQ
                Ce8vwPmE
                SVQXQCbc
                END
                """);
    }
}
