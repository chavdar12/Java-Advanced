import org.junit.jupiter.api.Test;

import static support.Console.check;

class FixEmailsTest {
    @Test
    void skipsUsUkAndComEmails() throws Exception {
        check("Ivan -> ivanivan@abv.bg", () -> FixEmails.main(new String[0]), """
                Ivan
                ivanivan@abv.bg
                Petar Ivanov
                petartudjarov@abv.uk
                Mike Tyson
                myke@gmail.us
                Gosho
                gosho@gmail.COM
                stop
                """);
    }
}
