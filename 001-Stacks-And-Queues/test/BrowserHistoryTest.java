import org.junit.jupiter.api.Test;

import static support.Console.check;

class BrowserHistoryTest {
    @Test
    void navigatesBackThroughHistory() throws Exception {
        check("""
                https://softuni.bg/
                no previous URLs
                https://softuni.bg/trainings/courses
                https://softuni.bg/
                https://softuni.bg/trainings/2056
                https://softuni.bg/
                https://softuni.bg/trainings/live
                https://softuni.bg/trainings/live/details
                """, () -> BrowserHistory.main(new String[0]), """
                https://softuni.bg/
                back
                https://softuni.bg/trainings/courses
                back
                https://softuni.bg/trainings/2056
                back
                https://softuni.bg/trainings/live
                https://softuni.bg/trainings/live/details
                Home
                """);
    }
}
