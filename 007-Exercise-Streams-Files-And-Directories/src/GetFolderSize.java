import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

// Usage: GetFolderSize <folder>
public class GetFolderSize {
    public static void main(String[] args) throws IOException {
        try (Stream<Path> paths = Files.walk(Path.of(args[0]))) {
            long size = paths.filter(Files::isRegularFile).mapToLong(path -> path.toFile().length()).sum();
            System.out.println("Folder size: " + size);
        }
    }
}
