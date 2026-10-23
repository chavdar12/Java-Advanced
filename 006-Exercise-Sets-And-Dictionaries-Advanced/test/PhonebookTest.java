import org.junit.jupiter.api.Test;

import static support.Console.check;

class PhonebookTest {
    @Test
    void addsAndSearches() throws Exception {
        check("Contact Mariika does not exist.\nNakov -> 0888080808", () -> Phonebook.main(new String[0]),
                "A Nakov 0888080808\nS Mariika\nS Nakov\nEND\n");
    }
}
