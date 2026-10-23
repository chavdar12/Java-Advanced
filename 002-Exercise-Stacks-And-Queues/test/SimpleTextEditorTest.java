import org.junit.jupiter.api.Test;

import static support.Console.check;

class SimpleTextEditorTest {
    @Test
    void appendEraseUndo() throws Exception {
        check("c\ny\na", () -> SimpleTextEditor.main(new String[0]), "8\n1 abc\n3 3\n2 3\n1 xy\n3 2\n4\n4\n3 1\n");
    }
}
