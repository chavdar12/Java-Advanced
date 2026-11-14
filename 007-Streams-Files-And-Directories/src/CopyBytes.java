import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        try (InputStream in = new FileInputStream(args[0]); OutputStream out = new FileOutputStream(args[1])) {
            int b;
            while ((b = in.read()) != -1) {
                if (b == ' ' || b == '\n' || b == '\r') {
                    out.write(b);
                } else {
                    out.write(String.valueOf(b).getBytes());
                }
            }
        }
    }
}
