import org.junit.jupiter.api.Test;

import static support.Console.check;

class ThePartyReservationFilterModuleTest {
    @Test
    void appliesFilters() throws Exception {
        check("Slav", () -> ThePartyReservationFilterModule.main(new String[0]),
                "Peter Misha Slav\nAdd filter;Starts with;P\nAdd filter;Starts with;M\nPrint\n");
    }

    @Test
    void removedFilterBringsGuestsBack() throws Exception {
        check("Misha John", () -> ThePartyReservationFilterModule.main(new String[0]),
                "Peter Misha John\nAdd filter;Starts with;P\nAdd filter;Starts with;M\nRemove filter;Starts with;M\nPrint\n");
    }

    @Test
    void lengthAndContains() throws Exception {
        check("Peter", () -> ThePartyReservationFilterModule.main(new String[0]),
                "Peter Misha Ana Gosho\nAdd filter;Length;3\nAdd filter;Contains;sh\nPrint\n");
    }
}
