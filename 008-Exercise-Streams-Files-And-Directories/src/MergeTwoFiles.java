import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

// Usage: MergeTwoFiles <first input> <second input> <output file>
public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Path.of(args[2])))) {
            for (int i = 0; i < 2; i++) {
                Files.readAllLines(Path.of(args[i])).forEach(writer::println);
            }
        }
    }
}
