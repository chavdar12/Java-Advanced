import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;

public class WriteToFile {
    private static final Set<Character> PUNCTUATION = Set.of(',', '.', '!', '?');

    public static void main(String[] args) throws IOException {
        try (InputStream in = new FileInputStream(args[0]); OutputStream out = new FileOutputStream(args[1])) {
            int b;
            while ((b = in.read()) != -1) {
                if (!PUNCTUATION.contains((char) b)) {
                    out.write(b);
                }
            }
        }
    }
}
