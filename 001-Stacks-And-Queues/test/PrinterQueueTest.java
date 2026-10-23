import org.junit.jupiter.api.Test;

import static support.Console.check;

class PrinterQueueTest {
    @Test
    void cancelsAndPrintsRemaining() throws Exception {
        check("""
                Canceled Lab.docx
                Printer is on standby
                Lecture.pdf
                Notes.txt
                """, () -> PrinterQueue.main(new String[0]), """
                Lab.docx
                cancel
                cancel
                Lecture.pdf
                Notes.txt
                print
                """);
    }
}
