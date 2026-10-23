import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

// Usage: WordCount <words file> <text file> <output file>
public class WordCount {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> counts = new LinkedHashMap<>();
        for (String word : Files.readString(Path.of(args[0])).trim().split("\\s+")) {
            counts.put(word, 0);
        }
        Arrays.stream(Files.readString(Path.of(args[1])).split("[^\\w']+"))
                .filter(counts::containsKey)
                .forEach(word -> counts.merge(word, 1, Integer::sum));
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Path.of(args[2])))) {
            counts.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));
        }
    }
}
