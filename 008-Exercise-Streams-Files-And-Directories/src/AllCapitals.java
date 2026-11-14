import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Usage: AllCapitals <input file> <output file>
public class AllCapitals {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             PrintWriter writer = new PrintWriter(new FileWriter(args[1]))) {
            String line = reader.readLine();
            while (line != null) {
                writer.println(line.toUpperCase());
                line = reader.readLine();
            }
        }
    }
}
