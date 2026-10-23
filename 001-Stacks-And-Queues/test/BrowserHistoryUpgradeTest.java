import org.junit.jupiter.api.Test;

import static support.Console.check;

class BrowserHistoryUpgradeTest {
    @Test
    void navigatesBackAndForward() throws Exception {
        check("""
                a.bg
                b.bg
                a.bg
                b.bg
                no next URLs
                a.bg
                no previous URLs
                """, () -> BrowserHistoryUpgrade.main(new String[0]), """
                a.bg
                b.bg
                back
                forward
                forward
                back
                back
                Home
                """);
    }

    @Test
    void newPageClearsForwardHistory() throws Exception {
        check("""
                a.bg
                b.bg
                a.bg
                c.bg
                no next URLs
                """, () -> BrowserHistoryUpgrade.main(new String[0]), """
                a.bg
                b.bg
                back
                c.bg
                forward
                Home
                """);
    }
}
