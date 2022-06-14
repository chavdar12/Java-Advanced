package src;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise_002 {
    public static void main(String[] args) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        Set<Character> punctuation = Set.of('(', ')', ',', '.', '?');


        String path = "input.txt";

        AtomicInteger vowelsCount = new AtomicInteger();
        AtomicInteger punctuationCount = new AtomicInteger();
        AtomicInteger consonantsCount = new AtomicInteger();
        try {
            List<String> lines = Files.readAllLines(Path.of(path));
            PrintWriter writer = new PrintWriter(new FileWriter("output4.txt"));
            lines.forEach(line -> {
                for (char c : line.toCharArray()) {
                    if (vowels.contains(c)) {
                        vowelsCount.getAndIncrement();
                    } else if (punctuation.contains(c)) {
                        punctuationCount.getAndIncrement();
                    } else if (c != ' ') {
                        consonantsCount.getAndIncrement();
                    }
                }
            });
            writer.printf("Vowels: %d%nConsonants: %d%nPunctuation: %d%n", vowelsCount.get(), consonantsCount.get(), punctuationCount.get());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
