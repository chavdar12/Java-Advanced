import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringJoiner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        StringJoiner bytes = new StringJoiner(" ");
        try (InputStream in = new FileInputStream(args[0])) {
            int b;
            while ((b = in.read()) != -1) {
                bytes.add(Integer.toBinaryString(b));
            }
        }
        System.out.println(bytes);
    }
}
