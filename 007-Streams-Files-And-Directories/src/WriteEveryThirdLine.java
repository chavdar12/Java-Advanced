import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             PrintWriter out = new PrintWriter(args[1])) {
            String line;
            int number = 1;
            while ((line = reader.readLine()) != null) {
                if (number % 3 == 0) {
                    out.println(line);
                }
                number++;
            }
        }
    }
}
