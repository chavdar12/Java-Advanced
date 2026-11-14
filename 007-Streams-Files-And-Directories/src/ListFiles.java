import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class ListFiles {
    public static void main(String[] args) {
        File[] entries = new File(args[0]).listFiles();
        if (entries == null) {
            return;
        }
        Arrays.stream(entries)
                .filter(File::isFile)
                .sorted(Comparator.comparing(File::getName))
                .forEach(f -> System.out.printf("%s: [%d]%n", f.getName(), f.length()));
    }
}
