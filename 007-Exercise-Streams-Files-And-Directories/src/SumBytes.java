import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Usage: SumBytes <input file>
public class SumBytes {
    public static void main(String[] args) throws IOException {
        long sum = 0;
        // every character except the line breaks counts, punctuation included
        for (String line : Files.readAllLines(Path.of(args[0]))) {
            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }
        }
        System.out.println(sum);
    }
}
