import org.junit.jupiter.api.Test;

import static support.Console.check;

class AcademyGraduationTest {
    @Test
    void printsAverageInNameOrder() throws Exception {
        check("George is graduated with 4.375\nMaria is graduated with 5.125",
                () -> AcademyGraduation.main(new String[0]), "2\nMaria\n4.25 6\nGeorge\n3.75 5\n");
    }
}
