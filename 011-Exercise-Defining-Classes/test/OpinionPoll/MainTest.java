package OpinionPoll;

import org.junit.jupiter.api.Test;

import static support.Console.check;

class MainTest {
    @Test
    void olderThanThirtyByName() throws Exception {
        check("Ivan - 48\nSam - 31", () -> Main.main(new String[0]), "3\nPeter 12\nSam 31\nIvan 48\n");
    }
}
