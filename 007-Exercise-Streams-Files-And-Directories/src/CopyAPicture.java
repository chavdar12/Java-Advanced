import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Usage: CopyAPicture <source image> <copy>
public class CopyAPicture {
    public static void main(String[] args) throws IOException {
        try (FileInputStream reader = new FileInputStream(args[0]);
             FileOutputStream writer = new FileOutputStream(args[1])) {
            byte[] buffer = new byte[4096];
            int readBytes = reader.read(buffer);
            while (readBytes != -1) {
                writer.write(buffer, 0, readBytes);
                readBytes = reader.read(buffer);
            }
        }
    }
}
