import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(new FileInputStream(args[0]));
             PrintWriter out = new PrintWriter(args[1])) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    out.println(scanner.nextInt());
                } else {
                    scanner.next();
                }
            }
        }
    }
}
