import org.junit.jupiter.api.Test;

import static support.Console.check;

class CitiesByContinentAndCountryTest {
    @Test
    void groupsInInputOrder() throws Exception {
        check("""
                Europe:
                  Bulgaria -> Sofia, Plovdiv
                  Poland -> Warsaw, Poznan
                  Germany -> Berlin
                Asia:
                  China -> Beijing, Shanghai
                  Japan -> Tokyo
                Africa:
                  Nigeria -> Abuja
                """, () -> CitiesByContinentAndCountry.main(new String[0]), """
                9
                Europe Bulgaria Sofia
                Asia China Beijing
                Asia Japan Tokyo
                Europe Poland Warsaw
                Europe Germany Berlin
                Europe Poland Poznan
                Europe Bulgaria Plovdiv
                Africa Nigeria Abuja
                Asia China Shanghai
                """);
    }
}
