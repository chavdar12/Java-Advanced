import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

// Usage: LineNumbers <input file> <output file>
public class LineNumbers {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(args[0]));
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Path.of(args[1])))) {
            for (int i = 0; i < lines.size(); i++) {
                writer.println((i + 1) + ". " + lines.get(i));
            }
        }
    }
}
