package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Exercise_008 {
    public static void main(String[] args) {
        String pathSearchedWords = "words.txt";
        Map<String, Integer> wordsCount = new LinkedHashMap<>();
        String path = "text.txt";

        try {
            List<String> lines = Files.readAllLines(Path.of(pathSearchedWords));
            lines.forEach(line -> Arrays.stream(line.split("\\s+")).forEach(word -> wordsCount.put(word, 0)));

            List<String> linesText = Files.readAllLines(Path.of(path));
            linesText.forEach(line -> Arrays.stream(line.split("\\s+")).forEach(word -> {
                if (wordsCount.containsKey(word)) {
                    wordsCount.put(word, wordsCount.get(word) + 1);
                }
            }));

            wordsCount.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEach(e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
