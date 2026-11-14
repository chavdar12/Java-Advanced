import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Usage: SumLines <input file>
public class SumLines {
    public static void main(String[] args) throws IOException {
        for (String line : Files.readAllLines(Path.of(args[0]))) {
            long sum = 0;
            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }
            System.out.println(sum);
        }
    }
}
